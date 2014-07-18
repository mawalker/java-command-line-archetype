#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import edu.vu.isis.magnum.cloudstats.stats.CsvProcessor;
import edu.vu.isis.magnum.cloudstats.stats.StatisticsCalculator;
import edu.vu.isis.magnum.cloudstats.stats.WebTestJsonReader;

public class Main {

		public static void main(String[] args) throws Exception {

		/*
		 * Create main to do logic, and cli to parse arguments
		 */
		Main main = new Main();
		CommandLineInterpreter cli = new CommandLineInterpreter();

		/*
		 * Parse arguments
		 */
		cli.parseCommandLineArgs(args);
		
		/*
		 * Do something here.
		 */
		
	}

}
