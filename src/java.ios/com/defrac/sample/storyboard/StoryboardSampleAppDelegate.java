package com.defrac.sample.storyboard;

import defrac.app.StoryboardAppDelegate;

// The StoryboardAppDelegate class is a simple utility class
// that is capable of instantiating a storyboard at runtime
//
// This has basically the same effect as choosing the "Main Interface"
// in the Xcode settings of a traditional iOS project
public class StoryboardSampleAppDelegate extends StoryboardAppDelegate {
  @Override
  protected String mainInterface() {
    return "Main";
  }
}
