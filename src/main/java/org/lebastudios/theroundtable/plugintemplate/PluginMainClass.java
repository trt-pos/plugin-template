package org.lebastudios.theroundtable.plugintemplate;

import javafx.scene.control.Button;
import org.lebastudios.theroundtable.MainStageController;
import org.lebastudios.theroundtable.fxml2java.CompileFxml;
import org.lebastudios.theroundtable.plugins.IPlugin;
import org.lebastudios.theroundtable.components.IconButton;

import java.util.List;

@CompileFxml(
        directories = {
                "org/lebastudios/theroundtable/plugintemplate"
        }
)
public class PluginMainClass implements IPlugin
{
    @Override
    public void initialize()
    {
        System.out.println("PluginTemplate initialized");
    }

    @Override
    public List<Button> getRightButtons()
    {
        IconButton button = new IconButton("core:plugins.png");
        button.setOnAction(_ -> MainStageController.getInstance().setCentralNode(new MainPaneController()));
        return List.of(button);
    }
}
