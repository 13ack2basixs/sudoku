package com.hongwei.sudoku.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.hongwei.sudoku.model.Sudoku;
import com.hongwei.sudoku.service.SudokuService;

// @RestController
// @RequestMapping("/api/sudoku")
@Controller
public class SudokuController {
    @Autowired
    private SudokuService service;

    @GetMapping("/")
    public String index(Model model) {
        int[][] puzzleArr = service.getSamplePuzzle();

        List<List<Integer>> puzzle = new ArrayList<>();
        for (int[] row : puzzleArr) {
            List<Integer> rowList = new ArrayList<>();
            for (int cell : row) {
                rowList.add(cell);
            }
            puzzle.add(rowList);
        }

        model.addAttribute("puzzle", puzzle);
        return "index";
    }
}
