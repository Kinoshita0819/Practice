package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.InquiryForm;

@Service
public class InquiryService {

	//問い合わせ内容
	public Boolean doInquiryEntry(InquiryForm dataForm) {
		//登録チェック
		if (!checkInquiry(dataForm)) {
			return false;
		}
		//登録処理
		if(!insertInquiry(dataForm)) {
			return false;
		}
		//その他
		if (!otherInquiry(dataForm)) {
			return false;
		}
		
		return true;
	}
	
	

	private Boolean checkInquiry(InquiryForm dataForm) {
		return true;
	}
	
	private Boolean insertInquiry(InquiryForm dataForm) {
		return true;
	}
	
	private boolean otherInquiry(InquiryForm dataForm) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}
	
}
