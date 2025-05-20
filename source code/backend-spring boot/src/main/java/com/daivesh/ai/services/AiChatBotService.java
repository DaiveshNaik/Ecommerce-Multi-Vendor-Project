package com.daivesh.ai.services;

import com.daivesh.exception.ProductException;
import com.daivesh.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
