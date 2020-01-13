## --save-dev与--save的区别

--save-dev表示只是在编译过程中所依赖的包，例如：webpack、sass-loader等 最后在package.json的devDependencies部分显示

--save 表示编译后在运行时还需要依赖的包，例如 react react-dom等 最后在package.json的dependencies部分显示


## 比如.babelrc文件，这个文件是用来设置转码的规则和插件的。

熟悉linux的话一定知道，rc结尾的文件通常代表运行时自动加载的文件，配置等等。在babel6中，这个文件必不可少。
里面可以对babel命令进行配置，以后再使用babel的cli的时候，可以少一些配置。还有一个env字段，可以对BABEL_ENV或者NODE_ENV指定的不同的环境变量，进行不同的编译操作。










This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.<br />
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.<br />
You will also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.<br />
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.<br />
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.<br />
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can’t go back!**

If you aren’t satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (Webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you’re on your own.

You don’t have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn’t feel obligated to use this feature. However we understand that this tool wouldn’t be useful if you couldn’t customize it when you are ready for it.


