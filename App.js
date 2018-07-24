import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  TouchableHighlight,
  NativeModules,
  TextInput,
  StatusBar,
  TouchableOpacity, WebView
} from 'react-native';
import firebase from 'react-native-firebase';
import { SwitchNavigator } from 'react-navigation';

// import the different screens
import Loading from './src/component/Load/Load'
import SignUp from './src/component/SignUp/SignUp'
import Login from './src/component/Login/Login'
import Main from './src/component/Main/Main'


const App = SwitchNavigator({
    Loading: {
      screen: Loading,
    },
    SignUp: {
      screen: SignUp,
    },
    Login: {
      screen: Login,
    },
    Main: {
      screen: Main,
    },
  },
  {
    initialRouteName: 'Loading'
  });

export default App;