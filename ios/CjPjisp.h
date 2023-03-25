
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNCjPjispSpec.h"

@interface CjPjisp : NSObject <NativeCjPjispSpec>
#else
#import <React/RCTBridgeModule.h>

@interface CjPjisp : NSObject <RCTBridgeModule>
#endif

@end
