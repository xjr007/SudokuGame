package sudoku.userinterface;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sudoku.problemdomain.Coordinates;
import sudoku.problemdomain.SudokuGame;
import sudoku.userinterface.IUserInterfaceContract.EventListener;

public class UserInterfaceImpl implements IUserInterfaceContract.View,
	EventHandler<KeyEvent> {
		
		private final Stage stage;
		private final Group root;
	
		private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;
	
		private IUserInterfaceContract.EventListener listener;
	
		private static final double WINDOW_Y = 732;
		private static final double WINDOW_X = 668;
		private static final double BOARD_X_AND_Y = 576;
		private static final double BOARD_PAD = 50;
	
		private static final Color WINDOW_BACKGROUND_COLOUR = Color.rgb(i:0, i1:150, i2:136);
		private static final Color BOARD_BACKGROUND_COLOUR = Color.rgb(i:224, i1:242, i2:241);
		private static final String SUDOKU = "Sudoku";

		
		public UserInterfaceImpl(Stage stage) {
			this.stage = stage;
			this.root = new Group();
			this.textFieldCoordinates = new HashMap<>();
			initializeUserInterface();
		}

		private void initializeUserInterface() {
			drawBackground(root);
			drawTitle(root);
			drawSudokuBoard(root);
			drawTextFields(root);
			drawGridLines(root);
			stage.show();
			
		}

		private void drawGridLines(Group root) {
			int xANDy = 114;
			int index = 0;
			
			while (index < 8) {
				int thickness;
				
				if (index == 2 || index == 5) {
					thickness = 3;
				}else {
					thickness = 2;
				}
				
				Rectangle verticalLine = getLine(
						xANDy + 64 * index,
						BOARD_PAD,
						BOARD_X_AND_Y,
						thickness
				);
				
				Rectangle horizontalLine = getLine(
						BOARD_PAD,
						xANDy + 64 * index,
						thickness,
						BOARD_X_AND_Y
				);
				
				root.getChildren().addAll(
						verticalLine,
						horizontalLine
				);
				
				index++;
			}
			
		}
		
		private Rectangle getLine(double x,
								  double y,
								  double height,
								  double width) {
		Rectangle line = new Rectangle();
		
		line.setX(x);
		line.setY(y);
		line.setHeight(height);
		line.setWidth(width);
		
		line.setFill(Color.BLACK);
		return line;
		}

		private void drawTextFields(Group root) {
			final int xOrigin = 50;
			final int yOrigin = 50;
			
		}

		private void drawSudokuBoard(Group root) {
			// TODO Auto-generated method stub
			
		}

		private void drawTitle(Group root) {
			// TODO Auto-generated method stub
			
		}

		private void drawBackground(Group root) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setListener(IUserInterfaceContract.EventListener listener) {
			this.listener = listener;
			
		}


		@Override
		public void updateSquare(int x, int y, int input) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void showDialog(String message) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void showError(String message) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void handle(KeyEvent keyEvent) {
		
		}


		
	

}
