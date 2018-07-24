//
//  LauncherManager.m
//  LauncherProject
//
//  Created by Che Cong Binh on 3/3/18.
//  Copyright © 2018 Facebook. All rights reserved.
//

#import "LauncherManager.h"
#import <React/RCTLog.h>

@implementation LauncherManager
  RCT_EXPORT_MODULE();
  
  RCT_EXPORT_METHOD(addEvent:(NSString *)name )
  {
    [[UIApplication sharedApplication] setAlternateIconName:name completionHandler:^(NSError * _Nullable error) {
      NSLog(@"Error...");
    }];
  
  }
@end
