import React,{Component} from 'react';
import ReactDOM from 'react-dom';
import './assets/style.scss';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = { };
    }
    /**
     * 一个组件类必须要实现render方法，render方法必须要返回jsx元素，必须要用一个外层的 JSX元素把所有内容包裹起来。
     * 返回并列多个JSX元素是不合法的
     */
    render(){
        return(
            <div>
                <p className="red">Hello World</p>
            </div>
        );
    }
}




// export与export default均可用于导出常量、函数、文件、模块
// 你可以在其它文件或模块中通过import+(常量 | 函数 | 文件 | 模块)名的方式，将其导入，以便能够对其进行使用

// 在一个文件或模块中，export、import可以有多个，export default仅有一个

// 通过export方式导出，在导入时要加{ }，export default则不需要
// 其实很多时候export与export default可以实现同样的目的，只是用法有些区别。注意第四条，通过export方式导出，在导入时要加{ }，export default则不需要。使用export default命令，为模块指定默认输出，这样就不需要知道所要加载模块的变量名。
export default App;

ReactDOM.render(<App />, document.getElementById('root'));

