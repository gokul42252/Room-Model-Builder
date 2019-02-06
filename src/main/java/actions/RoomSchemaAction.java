package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import ui.RoomSchemaDialog;


public class RoomSchemaAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        RoomSchemaDialog roomSchemaDialog =new RoomSchemaDialog(anActionEvent);
        roomSchemaDialog.setVisible(true);
    }
}
