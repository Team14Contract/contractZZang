package com.example.contract.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.contract.R

class ContactFragment : Fragment() {

    // Fragment가 처음으로 생성될 때 호출됩니다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fragment 초기화 및 데이터 로딩 등의 작업을 수행할 수 있습니다.
    }

    // Fragment의 UI를 생성하고 반환합니다.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Fragment의 레이아웃을 인플레이트하고 반환합니다.
        return inflater.inflate(R.layout.fragment_contract, container, false)
    }

    // onCreateView에서 반환된 뷰가 생성된 후 호출됩니다.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // onViewCreated에서 뷰에 대한 조작 및 이벤트 처리를 수행합니다.
    }

    // Fragment가 사용자에게 보여질 때 호출됩니다.
    override fun onResume() {
        super.onResume()

        // 사용자에게 보여지는 동안 필요한 작업을 수행합니다.
    }

    // Fragment에서 필요한 자원을 해제하고 정리할 때 호출됩니다.
    override fun onDestroyView() {
        super.onDestroyView()

        // 뷰와 관련된 자원을 해제할 수 있습니다.
    }

    // Fragment에서 사용하는 자원을 해제할 때 호출됩니다.
    override fun onDestroy() {
        super.onDestroy()

        // 자원을 정리하고 메모리 누수를 방지할 수 있습니다.
    }
}