import './App.css';
import ProductList from './components/ProductList';
import "primereact/resources/themes/lara-light-indigo/theme.css";  //theme
import "primereact/resources/primereact.min.css";                  //core css
import "primeicons/primeicons.css";   
import ProductContextProvider from './contexts/ProductContext';

function App() {
  return (
    <div className="App">
      <ProductContextProvider>
        <ProductList/>
      </ProductContextProvider>
    </div>
  );
}

export default App;
