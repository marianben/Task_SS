package com.example.demo.Java4.Home.Task3;

import java.util.Scanner;

/*
read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Error");
        int err = sc.nextInt();

        HTTPError error;
        error =HTTPError.Unknown_Error;
        switch (err) {

            case 400:
                error = HTTPError.Bad_Request;
                System.out.println(error);
                break;
            case 401:
                error = HTTPError.Unauthorized;
                System.out.println(error);
                break;
            case 402:
                error = HTTPError.Payment_Required;
                System.out.println(error);
                break;
            case 403:
                error = HTTPError.Forbidden;
                System.out.println(error);
                break;
            case 404:
                error = HTTPError.Not_Found;
                System.out.println(error);
                break;
            case 405:
                error = HTTPError.Method_Not_Allowed;
                System.out.println(error);
                break;
            default:
                error = HTTPError.Unknown_Error;
                System.out.println(error);
                break;
        }
    }
}
