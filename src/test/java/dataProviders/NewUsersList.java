package dataProviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.ProductData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class NewUsersList {
        @DataProvider(name = "getNewUserDataFromJson")
        public Object[] getNewUserDataFromJson() throws FileNotFoundException {
            JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/java/dataFiles/NewUsers.JSON"));
            JsonElement newUsersDataSet = jsonData.getAsJsonObject().get("dataset");

            List<ProductData> newUsersData = new Gson().fromJson(newUsersDataSet, new TypeToken<List<ProductData>>() {
            }.getType());

            Object[][] returnValue = new Object[newUsersData.size()][1];

            int index = 0;

            for (Object[] each : returnValue) {
                each[0] = newUsersData.get(index++);
            }

            return returnValue;
        }

    }


