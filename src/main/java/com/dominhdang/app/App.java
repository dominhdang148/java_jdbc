package com.dominhdang.app;

import java.util.Scanner;

import com.dominhdang.app.UI.MenuSelection;
import com.dominhdang.app.UI.UI;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MenuSelection menu = null;
    do {
      menu = UI.ChooseOption(scanner);
      UI.HandleOption(menu, scanner);
    } while (menu != MenuSelection.EXIT);
    scanner.close();
  }
}
