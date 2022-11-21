import java.io.*;
import java.util.*;

public class PL {
    public static void main(String[] args) {
        String[] keywords = {
            "if", "else", "while", "for", "do", "break", "continue",
            "return", "switch", "case", "default", "goto", "sizeof",
            "typedef", "struct", "union", "enum", "auto", "register",
            "static", "extern", "const", "volatile", "void", "char",
            "short", "int", "long", "float", "double", "signed",
            "unsigned", "true", "false", "NULL", "class", "public",
            "private", "protected", "virtual", "friend", "inline",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch"
        };

        String[] operators = {
            "+", "-", "*", "/", "%", "++", "--", "=", "+=", "-=",
            "*=", "/=", "%=", "==", "!=", ">", "<", ">=", "<=",
            "&&", "||", "!", "&", "|", "^", "~", "<<", ">>", ">>>"
        };

        String[] separators = {
            "(", ")", "[", "]", "{", "}", ",", ";", ".", ":", "?"
        };

        String[] literals = {
            "true", "false", "NULL"
        };

        String[] identifiers = {
            "if", "else", "while", "for", "do", "break", "continue",
            "return", "switch", "case", "default", "goto", "sizeof",
            "typedef", "struct", "union", "enum", "auto", "register",
            "static", "extern", "const", "volatile", "void", "char",
            "short", "int", "long", "float", "double", "signed",
            "unsigned", "true", "false", "NULL", "class", "public",
            "private", "protected", "virtual", "friend", "inline",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch"
        };  

        String[] comments = {
            "//", "/*", "*/"
        };

        String[] whitespaces = {
            " ", "\t", "

            "
        };

        String[] preprocessor = {
            "#include", "#define", "#undef", "#ifdef", "#ifndef", "#else",
            "#elif", "#endif", "#error", "#pragma"
        };

        String[] constants = {
            "true", "false", "NULL"
        };

        String[] types = {
            "void", "char", "short", "int", "long", "float", "double",
            "signed", "unsigned"
        };

        String[] storage = {
            "auto", "register", "static", "extern", "const", "volatile"
        };

        String[] access = {
            "public", "private", "protected"
        };

        String[] classes = {
            "class", "struct", "union", "enum"
        };

        String[] control = {
            "if", "else", "while", "for", "do", "break", "continue",
            "return", "switch", "case", "default", "goto", "sizeof"
        };

        String[] functions = {
            "sizeof", "typedef", "struct", "union", "enum", "auto",
            "register", "static", "extern", "const", "volatile", "void",
            "char", "short", "int", "long", "float", "double", "signed",
            "unsigned", "true", "false", "NULL", "class", "public",
            "private", "protected", "virtual", "friend", "inline",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this", "operator", "throw",
            "catch", "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",
            "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch",

        };

        String[] operators = {
            "+", "-", "*", "/", "%", "++", "--", "=", "+=", "-=", "*=",
            "/=", "%=", "==", "!=", "<", ">", "<=", ">=", "&&", "||",
            "!", "&", "|", "^", "~", "<<", ">>", ">>=", "<<=", "&=", "|=",
            "^=", "?:", ",", "->", ".", "::", "[]", "()", "new", "delete"
        };

        String[] brackets = {
            "(", ")", "{", "}", "[", "]"
        };

        String[] numbers = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };

        String[] strings = {
            "\"", "'"
        };

        String[] others = {
            ";", ":", "?", "!", "@", "#", "$", "%", "^", "&", "*", "(",
            ")", "-", "_", "+", "=", "{", "}", "[", "]", "|", "\\", ":",
            ";", "\"", "'", "<", ">", ",", ".", "/", "`", "~"
        };

        String[] all = {
            "void", "char", "short", "int", "long", "float", "double",
            "signed", "unsigned", "auto", "register", "static", "extern",
            "const", "volatile", "public", "private", "protected",
            "virtual", "friend", "inline", "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this", "operator", "throw",
            "catch", "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch", "try",
            "using", "namespace", "template", "typename", "new", "delete",
            "this", "operator", "throw", "catch", "try", "using",
            "namespace", "template", "typename", "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this", "operator", "throw",
            "catch", "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch", "try",
            "using", "namespace", "template", "typename", "new", "delete",
            "this", "operator", "throw", "catch", "try", "using",
            "namespace", "template", "typename", "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this
            ", "operator", "throw",
            "catch", "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch", "try",
            "using", "namespace", "template", "typename", "new", "delete",
            "this", "operator", "throw", "catch", "try", "using",
            "namespace", "template", "typename", "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this", "operator", "throw",

            "+", "-", "*", "/", "%", "++", "--", "=", "+=", "-=", "*=",
            "/=", "%=", "==", "!=", "<", ">", "<=", ">=", "&&", "||",
            "!", "&", "|", "^", "~", "<<", ">>", ">>=", "<<=", "&=", "|=",
            "^=", "?:", ",", "->", ".", "::", "[]", "()", "new", "delete",

            "(", ")", "{", "}", "[", "]",

            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",

            "\"", "'",

            ";", ":", "?", "!", "@", "#", "$", "%", "^", "&", "*", "(",

            ")", "-", "_", "+", "=", "{", "}", "[", "]", "|", "\\", ":",

            ";", "\"", "'", "<", ">", ",", ".", "/", "`", "~"

        };

        String[] keywords = {
            "void", "char", "short", "int", "long", "float", "double",
            "signed", "unsigned", "auto", "register", "static", "extern",
            "const", "volatile", "public", "private", "protected",
            "virtual", "friend", "inline", "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this", "operator", "throw",
            "catch", "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch", "try",
            "using", "namespace", "template", "typename", "new", "delete",
            "this", "operator", "throw", "catch", "try", "using",
            "namespace", "template", "typename", "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this", "operator", "throw",
            "catch", "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch", "try",
            "using", "namespace", "template", "typename", "new", "delete",
            "this", "operator", "throw", "catch", "try", "using",
            "namespace", "template", "typename", "new", "delete", "this",
            "operator", "throw", "catch", "try", "using", "namespace",
            "template", "typename", "new", "delete", "this", "operator",
            "throw", "catch", "try", "using", "namespace", "template",
            "typename", "new", "delete", "this", "operator", "throw",
            "catch", "try", "using", "namespace", "template", "typename",
            "new", "delete", "this", "operator", "throw", "catch", "try",
            "using", "namespace", "template", "typename", "new", "delete",
            "this", "operator", "throw", "catch", "try", "using",

            "if", "else", "switch", "case", "default", "for", "while",

            "do", "goto", "continue", "break", "return", "sizeof",

            "typedef", "struct", "union", "enum", "class", "asm", "dynamic_cast",

            "explicit", "export", "false", "mutable", "namespace", "operator",

            "private", "protected", "public", "reinterpret_cast", "static_cast",

            "template", "this", "throw", "true", "try", "typeid", "typename",

            "using", "virtual", "wchar_t", "and", "and_eq", "bitand", "bitor",

            "compl", "not", "not_eq", "or", "or_eq", "xor", "xor_eq",

            "alignas", "alignof", "char16_t", "char32_t", "constexpr", "decltype",

            "noexcept", "nullptr", "static_assert", "thread_local",

            "override", "final", "nullptr", "decltype", "constexpr", "consteval",

            "constinit", "co_await", "co_return", "co_yield", "requires",

            "import", "module", "transaction_safe", "transaction_safe_dynamic",

            "auto", "bool", "char", "char16_t", "char32_t", "const", "constexpr",

            "decltype", "double", "float", "int", "long", "mutable", "register",

            "short", "signed", "static", "static_assert", "static_cast", "struct",

            "template", "thread_local", "typedef", "typename", "union", "unsigned",

            "using", "virtual", "void", "volatile", "wchar_t", "xor", "xor_eq",

            "and", "and_eq", "bitand", "bitor", "compl", "not", "not_eq", "or",

            "or_eq", "alignas", "alignof", "asm", "auto", "bool", "break",

            "case", "catch", "char", "char16_t", "char32_t", "class", "const",

            "constexpr", "const_cast", "continue", "decltype", "default", "delete",

            "do", "double", "dynamic_cast", "else", "enum", "explicit", "export",

            "extern", "false", "float", "for", "friend", "goto", "if", "inline",

            "int", "long", "mutable", "namespace", "new", "noexcept", "not",

            "not_eq", "nullptr", "operator", "or", "or_eq", "private", "protected",

            "public", "register", "reinterpret_cast", "requires", "return",

            "short", "signed", "sizeof", "static", "static_assert", "static_cast",

            "struct", "switch", "template", "this", "thread_local", "throw",

            "true", "try", "typedef", "typeid", "typename", "union", "unsigned",

            "using", "virtual", "void", "volatile", "wchar_t", "while", "xor",

            "xor_eq", "alignas", "alignof", "and", "and_eq", "asm", "auto",

            "bitand", "bitor", "bool", "break", "case", "catch", "char",

            "char16_t", "char32_t", "class", "compl", "const", "constexpr",

            "const_cast", "continue", "decltype", "default", "delete", "do",

            "double", "dynamic_cast", "else", "enum", "explicit", "export",

            "extern", "false", "float", "for", "friend", "goto", "if", "inline",

            "int", "long", "mutable", "namespace", "new", "noexcept", "not",

            "not_eq", "nullptr", "operator", "or", "or_eq", "private", "protected",

            "public", "register", "reinterpret_cast", "requires", "return",

            "short", "signed", "sizeof", "static", "static_assert", "static_cast",

            "struct", "switch", "template", "this", "thread_local", "throw",

            "true", "try", "typedef", "typeid", "typename", "union", "unsigned",

        };

        for (int i = 0; i < sizeof(keywords) / sizeof(keywords[0]); i++) {

            if (strcmp(keywords[i], word) == 0) {

                return true;

            }

        }

        return false;

    }

    void printWord(char *word, int wordLength) {

        if (isKeyword(word)) {

            printf("\033[1;31m%s\033[0m", word);

        } else {

            printf("%s", word);

        }

    }

    int main(int argc, char *argv[]) {

        char word[100];

        int wordLength = 0;

        char c;

        while ((c = getchar()) != EOF) {

            if (isalpha(c) || isdigit(c) || c == '_') {

                word[wordLength++] = c;

            } else {

                word[wordLength] = '\0';

                printWord(word, wordLength);

                wordLength = 0;

                putchar(c);

            }

        }

        return 0;

    }

    
