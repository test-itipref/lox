package com.craftinginterpreters.lox;

enum TokenType {
    // 記号一個のトークン
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEPERATOR, SLASH, STAR, SEMICOLON,

    // 記号一個または二個によるトークン
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL, GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,

    // リテラル
    IDENTIFIER, STRING, NUMBER,

    // キーワード
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF
}
