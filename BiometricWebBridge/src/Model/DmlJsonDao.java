package Model;

import Domain.ConfigDTO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio Herrera
 */
public class DmlJsonDao implements IDmlJsonDao {

    private static final String CONFIG = "src/Config/Config.json";

    @Override
    public boolean createFileJson() throws IOException {
        File file = new File(CONFIG);
        return file.createNewFile();
    }

    @Override
    public List<ConfigDTO> select() {
        ArrayList<ConfigDTO> listConfig = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(CONFIG));
            if (br.readLine() != null) {
                JsonParser parser = new JsonParser();
                try (FileReader fileReader = new FileReader(CONFIG)) {
                    JsonArray list = (JsonArray) parser.parse(fileReader);
                    for (JsonElement jsonElement : list) {
                        JsonObject jsonObject = jsonElement.getAsJsonObject();
                        ConfigDTO cf = new ConfigDTO();
                        cf.setId(jsonObject.get("id").getAsString());
                        cf.setSerial_number_pc(jsonObject.get("serial_number_pc").getAsString());
                        cf.setUrl_api(jsonObject.get("url_api").getAsString());
                        cf.setBrowser(jsonObject.get("browser").getAsString());
                        cf.setStatus(jsonObject.get("status").getAsString());
                        listConfig.add(cf);
                    }
                }
            }
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            System.out.println("Error Clase: DmlJsonDao, Metodo: select" + e.getMessage());
        }
        return listConfig;
    }

    @Override
    public int insert(ConfigDTO config) {

        try {
            ArrayList<ConfigDTO> listConfig = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(CONFIG));
            if (br.readLine() != null) {
                JsonParser parser = new JsonParser();
                try (FileReader fileReader = new FileReader(CONFIG)) {
                    JsonArray list = (JsonArray) parser.parse(fileReader);
                    for (JsonElement jsonElement : list) {
                        JsonObject jsonObject = jsonElement.getAsJsonObject();
                        ConfigDTO cf = new ConfigDTO();
                        cf.setId(jsonObject.get("id").getAsString());
                        cf.setSerial_number_pc(jsonObject.get("serial_number_pc").getAsString());
                        cf.setUrl_api(jsonObject.get("url_api").getAsString());
                        cf.setBrowser(jsonObject.get("browser").getAsString());
                        cf.setStatus("Inactive");
                        listConfig.add(cf);
                    }
                }
            }
            listConfig.add(config);
            try (FileWriter file = new FileWriter(CONFIG)) {
                file.write(new Gson().toJson(listConfig));
                file.flush();
            }
            return 1;
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            System.out.println("Error Clase: DmlJsonDao, Metodo: insert" + e.getMessage());
            return 0;
        }

    }

    @Override
    public int update(ConfigDTO config) {
        return 0;
    }

    @Override
    public int delete(ConfigDTO config) {
        return 0;
    }

    @Override
    public int changeBrowser(ConfigDTO config) {
        return 0;
    }

    @Override
    public ConfigDTO activeNav() {
        return null;
    }

    @Override
    public List<String> listNav() {
        return null;
    }

}
