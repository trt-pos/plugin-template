package org.lebastudios.theroundtable.plugintemplate;

import javafx.scene.control.Button;
import org.lebastudios.theroundtable.MainStageController;
import org.lebastudios.theroundtable.plugins.IPlugin;
import org.lebastudios.theroundtable.ui.IconButton;

import java.util.List;

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
        IconButton button = new IconButton("plugin.png");
        button.setOnAction(_ -> MainStageController.getInstance().setCentralNode(new MainPaneController()));
        return List.of(button);
    }
}
