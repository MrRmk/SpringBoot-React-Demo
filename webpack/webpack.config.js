const path = require("path");
const webpack = require('webpack');
const HtmlWebpackPlugin = require('html-webpack-plugin');   //自动创建html文件
const ExtractTextPlugin = require('extract-text-webpack-plugin');//我们要编译后把css样式和js拆分开来，这时我们就需要用到样式分离插件
const CleanWebpackPlugin = require('clean-webpack-plugin'); //清除多余文件

module.exports = {  
    //devtool: 'cheap-module-eval-source-map',//用于开发调试，方便清楚是那个文件出错（共有7种）
    devtool: 'inline-source-map',
    entry: {    //是入口文件
        index: './src/index.js'
    },
    output: {   //是编译后文件
        filename: 'bundls.js',      // 打包后输出的文件名
        path: path.resolve(__dirname, 'build')  // __dirname 全局变量  代表当前文件所在文件夹的完整路径  // path.resolve 返回一个路径 __dirname+'/build'
    },
    module: {
        rules: [{
            test: /\.(js|jsx)$/,    //正则匹配，匹配相同后缀的文件
            loader: 'babel-loader', //因为react是使用jsx编写，浏览器无法识别，所以需要一个编译工具，这里使用babel
            exclude: /node_modules/ //必不匹配选项
        },
        {
            test: /\.css$/,
            loader: "style-loader!css-loader"
        },
        // {
        //     test: /\.scss$/,
        //     loader:["style-loader","css-loader","sass-loader"]
        //     // 加载时顺序从右往左
        // },
        {
            test: /\.(png|svg|jpg|gif)$/,
            loader: 'url-loader',
            options: {
                limit: 10000,
                name: 'img/[name].[hash:7].[ext]'
            }
        },{
            test: /\.scss$/,
            loader: ExtractTextPlugin.extract({
                fallback: "style-loader",
                use: "css-loader!sass-loader"
            })
        }]
    },
    //开启一个虚拟服务器
    devServer: {
        contentBase: './build', //本地服务器所加载的页面所在的目录
        port: 8082,
        inline: true,   //实时刷新
        hot: true
    },
    plugins: [
        //new CleanWebpackPlugin(['dist']), //每次编译都会把dist下的文件清除，我们可以在合适的时候打开这行代码，例如我们打包的时候，开发过程中这段代码关闭比较好
        new webpack.HotModuleReplacementPlugin(),//热加载插件
        new ExtractTextPlugin("style.css"),
        new HtmlWebpackPlugin({
            template: 'src/index.html'     //使用一个模板
        })
    ]
};


