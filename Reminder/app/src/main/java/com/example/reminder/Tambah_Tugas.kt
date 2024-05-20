package com.example.reminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.reminderplus.databinding.FragmentTambahTugasBinding
import com.example.reminderplusuas.utils.model.ToDoData
import com.google.android.material.textfield.TextInputEditText

class Tambah_Tugas : Fragment() {
    private lateinit var binding: FragmentTambahTugasBinding
    private var listener : OnDialogNextBtnClickListener? = null
    private var toDoData: ToDoData? = null


    fun setListener(listener: OnDialogNextBtnClickListener) {
        this.listener = listener
    }

    companion object {
        const val TAG = "DialogFragment"
        @JvmStatic
        fun newInstance(taskId: String, task: String) =
            Tambah_Tugas().apply {
                arguments = Bundle().apply {
                    putString("taskId", taskId)
                    putString("task", task)
                }
            }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTambahTugasBinding.inflate(inflater , container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments != null){

            toDoData = ToDoData(arguments?.getString("taskId").toString() ,arguments?.getString("task").toString())
            binding.tempatteks.setText(toDoData?.task)
        }


        binding.todoClose.setOnClickListener {

        }

        binding.todoNextBtn.setOnClickListener {

            val todoTask = binding.tempatteks.text.toString()
            if (todoTask.isNotEmpty()){
                if (toDoData == null){
                    listener?.saveTask(todoTask , binding.tempatteks)
                }else{
                    toDoData!!.task = todoTask
                    listener?.updateTask(toDoData!!, binding.tempatteks)
                }

            }
        }
    }

    interface OnDialogNextBtnClickListener{
        fun saveTask(todoTask:String , todoEdit: TextInputEditText)
        fun updateTask(toDoData: ToDoData, todoEdit: TextInputEditText)
    }
}