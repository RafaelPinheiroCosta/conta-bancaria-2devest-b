package com.senai.conta_bancaria.interface_ui.exception;

import com.senai.conta_bancaria_turma2.domain.exceptions.EntidadeNaoEncontradaException;
import com.senai.conta_bancaria_turma2.domain.exceptions.ValoresNegativoException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {




}
