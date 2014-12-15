package com.defrac.sample.storyboard;

import defrac.annotation.WeakReference;
import defrac.dni.IBAction;
import defrac.dni.IBOutlet;
import defrac.ios.uikit.UILabel;
import defrac.ios.uikit.UIViewController;

// Our controller is bound to the storyboard using its
// fully qualified class name, replacing dots with underscores
// When choosing a custom class inside Interface Builder, the
// correct value to reference this controller is:
//   com_defrac_sample_storyboard_StoryboardViewController
//
// You can mix defrac controllers with others that you write in
// Objective-C. The defrac compiler will only emit a warning if
// a class does not exist and is not inside the top-level.
public final class StoryboardViewController extends UIViewController {
  // Annotating your properties as @IBOutlet has the benefit
  // of defrac generating code that will look familiar to
  // Xcode and Interface Builder so all connections are shown
  // in Xcode as well
  @IBOutlet
  @WeakReference
  public UILabel label;

  @IBOutlet
  @WeakReference
  public UILabel changeMeOnLoad;

  private int clicks = 0;

  @Override
  public void viewDidLoad() {
    super.viewDidLoad();
    changeMeOnLoad.text = "Hello from defrac!";
  }

  @IBAction
  public void onClick(final Object sender) {
    label.text = "This is click number "+(++clicks);
  }
}
