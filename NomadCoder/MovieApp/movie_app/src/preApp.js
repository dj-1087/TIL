import React from 'react';

class preApp extends React.Component {
  constructor(props) {
    super(props);
    console.log("hello");
  }
  //Java의 field
  state = {
    count: 0,
  };

  add = () => {
    this.setState(current => ({count: current.count+1}));
  }

  minus = () => {
    this.setState(current => ({count: current.count-1}));
  }

  componentDidMount() {
    console.log("component rendered");
  }
  componentDidUpdate() {
    console.log("component updated");
  }
  componentWillUnmount() {
    console.log("Goodbye, cruel world");
  }
  //Java의 main()
  render() {
    console.log("Im rendering")
    return (
      <div>
        <h1>The number is {this.state.count}</h1>
        <button onClick={this.add}>Add</button>
        <button onClick={this.minus}>Minus</button>
      </div>
    );
  }
}

export default preApp;