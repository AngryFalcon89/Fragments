# Fragments
![preview](https://github.com/AngryFalcon89/Fragments/assets/91687355/b1f1c94e-43c3-4ed0-89b2-9579cb14a168)

### Creating Fragments
### Step 1: Create a Fragment Class
Create a new Kotlin class that extends the Fragment class. This class will represent your fragment.<br> A new Fragment can be created simply by right-clicking and creating new fragment option in Android Studio 
```kotlin
class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    companion object {
    }
}
```

### Step 2: Initialize Fragment Binding
Initialize a fragment binding object to access the views within the fragment.(fragment binding cannot be initialized by lazy cuz it is required to be inflated inside onCreateView() fun of fragment

```kotlin
private lateinit var binding: FragmentBlankBinding
```

### Step 3: Inflate the Fragment Layout
In the onCreateView method of your fragment, inflate the fragment layout using the fragment binding:

```kotlin
binding = FragmentBlankBinding.inflate(inflater, container, false)
return binding.root
```

Step 5: Implement Fragment Logic
Implement any logic, UI interactions, or data handling within the fragment as needed.

### Using Fragments in an Activity
### Step 1: Add FrameLayout in activity main XML 

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="16dp"
            android:layout_weight="1"
            android:text="Button" />

        <Button
            android:id="@+id/button2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="16dp"
            android:layout_weight="1"
            android:text="Button" />
    </LinearLayout>
    <FrameLayout
        android:id="@+id/frame"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</LinearLayout>
```
Step 2: Replace Fragments in Activity
Inside the activity's onCreate method, use a FragmentManager to replace fragments within a container view.

```kotlin
binding.button.setOnClickListener {
    val manager = supportFragmentManager.beginTransaction()
    manager.replace(R.id.frame, BlankFragment())
    manager.commit()
}
```
