package Strings;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class SPIssue {

	public static void main(String args[]) {
		String query = "PKG_WRAPPER_NTW.PRENOTA_RISORSA_LNA(GAT IN String,MERCATO IN String,TIPO_SERVIZIO IN String,LISTINO IN String,CLUSTER_LISTINO IN String,CODICE_ISTAT IN String,N_AGGIUNTIVI IN INT,ESITO_PRENOTAZIONE OUT String,MESSAGGIO_DI_ERRORE OUT String,STATO_SITO OUT String,ID_CIRCUITO_1 OUT String,ID_CIRCUITO_2 OUT String,ID_CIRCUITO_3 OUT String,TIPO_ACCESSO OUT String,USO OUT String,NUMERAZIONE OUT NDBGW.T_NUMERAZIONE,ID_REQUEST OUT String,SISTEMACHIAMANTE IN String,RICERCA_UNICA IN String,FLG_MUX IN String,CODICE_PROGETTO OUT String)";
		
		List listInputParam = new List();
		
		String[] queryArray = query.split("\\(");
		String procedureName = queryArray[0];
		String paramInfo = queryArray[1].substring(0, queryArray[1].length() - 1);
		String[] totalParam = paramInfo.split("\\,");
		LinkedHashMap<String, String> inputHash = new LinkedHashMap<String, String>();
		HashMap<String, String> inputHashKey = new HashMap<String, String>();
		HashMap<String, String> outputHash = new HashMap<String, String>();
		//ProcedureCall pc = s.createStoredProcedureCall(procedureName);
		int j;
		int v = 0;
		String[] splitAction = null;
		for (int i = 0; i < totalParam.length; i++) {
			splitAction = totalParam[i].split("\\ ");
			for (j = 0; j < splitAction.length; j++) {
				if (splitAction[j].equalsIgnoreCase("IN")) {
					inputHash.put(splitAction[j - 1], splitAction[j + 1]);
					//inputHashKey.put(splitAction[j - 1], listInputParam.get(v).toString());
					v++;
					break;
				} else if (splitAction[j].equalsIgnoreCase("OUT")) {
					outputHash.put(splitAction[j - 1], splitAction[j + 1]);
					break;
				}
			}
		}

		int k = 0;
		System.out.println(procedureName);
		
	/*	for (Map.Entry<String, String> entry : inputHash.entrySet()) {
			pc.registerParameter(entry.getKey(), String.class, ParameterMode.IN)
					.bindValue(inputHashKey.get(entry.getKey()));
		}

		for (Map.Entry<String, String> entry : outputHash.entrySet()) {
			pc.registerParameter(entry.getKey(), String.class, ParameterMode.OUT);
		}

		output = new ArrayList<String>();

		for (Map.Entry<String, String> entry : outputHash.entrySet()) {
			output.add((String) pc.getOutputs().getOutputParameterValue(entry.getKey()));
		}

		log.info(output);
		return (output);
*/
	}

}
