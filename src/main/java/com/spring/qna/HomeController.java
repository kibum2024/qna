package com.spring.qna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

//    @GetMapping("/page1")
//    @ResponseBody
//    public String showPage1() {
//        return """
//            <form method="POST" action="page2">
//                <input type="number" name="age" placeholder="나이입력" />
//                <input type="submit" value="page2로 POST 방식으로 이동합니다." />
//            </form>
//            """;
//    }
//
//    @PostMapping("/page2")
//    @ResponseBody
//    public String showPage2(@RequestParam(defaultValue = "0") int age) {
//        return """
//            <h1>입력된 나이: %d</h1>
//            <h1>POST 방식으로 오신걸 환영합니다.</h1>
//            """.formatted(age);
//    }
//
//    @GetMapping("/page2")
//    @ResponseBody
//    public String showPage3(@RequestParam(defaultValue = "0") int age) {
//        return """
//            <h1>입력된 나이: %d</h1>
//            <h1>GET 방식으로 오신걸 환영합니다.</h1>
//            """.formatted(age);
//    }
//
//    @GetMapping("/gugudan")
//    @ResponseBody
//    public String showGugudan(Integer dan, Integer limit) {
//        if (dan == null) {
//            dan = 2;
//        }
//        if (limit == null) {
//            limit = 2;
//        }

//        String gugudanString = "";

//        for (int i = 2; i <= 9; i++) {
//            for (int j = 2; j <= 9; j++) {
//            gugudanString += "%d * %d = %d <br>".formatted(i, j, i * j);
//            }
//        }
//        Integer finalDan = dan;
//        return IntStream.rangeClosed(1, limit)
//                .mapToObj(i -> "%d * %d = %d".formatted(finalDan, i, finalDan * i))
//                .collect(Collectors.joining("<br>"));
//    }

//    @GetMapping("/mbti/{name}")
//    @ResponseBody
//    public String showMbti(@PathVariable String name) {
//        String tr = switch (name) {
//            case "홍길동" -> "INFP";
//            case "홍이동" -> "ENFP";
//            case "홍삼동" -> "ISFP";
//            case "홍사동" -> "INTP";
//            default -> "모름";
//        };
//        return tr;
//    }

}
