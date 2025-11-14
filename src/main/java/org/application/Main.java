package org.application;

import org.application.service.ApiService;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ApiService apiService = new ApiService();

        String zipCode = "";
        System.out.println("Digite o seu CEP: ");
        zipCode = scanner.nextLine();

            try {
                System.out.println(apiService.getAddress(zipCode));
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

