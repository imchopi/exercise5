package com.adrian.exercise5;
import java.util.Map;

public class Exercise5
{
    public static void main( String[] args ){
        try {
            ProcessBuilder command = new ProcessBuilder();

            // We are mapping the process from command.environment
            Map<String, String> environment = command.environment();

            // We are printing the environment mapped, we could then print:
            /*
             * variable.Key = varaible.Value
             * 
             * output example
             * TERM = xterm-256color
             * 
             * TERM is the key
             * xterm-256color is the value
             * 
             */
            for (Map.Entry<String, String> variable : environment.entrySet())
                System.out.println(variable.getKey() + " = " + variable.getValue());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}