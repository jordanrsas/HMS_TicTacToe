package com.dtse.demo.tictactoe

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    companion object {
        private const val TAG = "HMS_FirstFragment"
        private const val HMS_REQUEST_CODE = 8888
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //checkAuthWithSilentSignIn()
        buttonHuaweiLogIn.setOnClickListener {
            signIn()
        }
    }

    private fun checkAuthWithSilentSignIn() {

    }

    private fun signIn() {
        findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == HMS_REQUEST_CODE) {

        } else {

        }
    }
}