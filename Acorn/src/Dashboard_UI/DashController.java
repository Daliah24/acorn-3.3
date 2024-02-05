package Dashboard_UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class DashController {
    private DashModel model;
    private DashView view;
    private final int animationDelay = 10; // milliseconds
        private final int animationStep = 2;   // pixels
    public DashController(DashModel model, DashView view) {
        this.model = model;
        this.view = view;
    }  
        

        // Attach action listener to update the view
        

    // Other controller methods


  private void setupAnimation() {
        Timer timer = new Timer(animationDelay, new ActionListener() {
            int currentX = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                moveDashLabel(currentX);
                currentX += animationStep;

                if (currentX > view.getAnimationPaneWidth()) {
                    currentX = 0;
                }
            }
        });

        timer.start();
    }

    private void moveDashLabel(int x) {
        view.moveDashLabel(x);
    }
}