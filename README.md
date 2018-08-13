# Android smart location tracker

A useful and easy to use android location tracker.

## Getting Started

This library provides some utilities for getting realtime location by any exist provider.

### Prerequisites

Android studio with gradle version 3.0+


### Installing

Add this items in your build.gradle file
```
Gradel:
Step 1. Add the JitPack repository to your build file
allprojects {
		repositories {
		
			maven { url 'https://jitpack.io' }
		}
	}
  Step 2. Add the dependency
  dependencies {
	        implementation 'com.github.MoeidHeidari:LocationTracker:1.01'
	}
  Maven:
  Step 1. Add the JitPack repository to your build file
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  Step 2. Add the dependency
  <dependency>
	    <groupId>com.github.MoeidHeidari</groupId>
	    <artifactId>LocationTracker</artifactId>
	    <version>1.01</version>
	</dependency>
  SBT:
  Step 1. Add the JitPack repository to your build file
  resolvers += "jitpack" at "https://jitpack.io"
  
  Step 2. Add the dependency
  libraryDependencies += "com.github.MoeidHeidari" % "LocationTracker" % "1.01"	
  
  Leiningen:
  Step 1. Add the JitPack repository to your build file
  :repositories [["jitpack" "https://jitpack.io"]]
  Step 2. Add the dependency
  :dependencies [[com.github.MoeidHeidari/LocationTracker "1.01"]]	
  
```
## How to use
```

public class MainActivity extends AppCompatActivity {
    LocationTracker tracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tracker =new LocationTracker(this);
        Toast.makeText(this, String.valueOf(tracker.getLatitude()),
                Toast.LENGTH_LONG).show();
        tracker.setOnLocationChanged(new OnLocationChanged() {
            @Override
            public void OnChange(Location location) {

                //Write your codes here
            }
        });


    }
}

```

## Author

* **Moeid Heidari** 

## And a special thanks to everyone who helped me

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

