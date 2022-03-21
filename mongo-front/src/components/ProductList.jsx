import React, { useContext, useState } from "react";
import { Panel } from "primereact/panel";
import { DataTable } from "primereact/datatable";
import { Column } from "primereact/column";
import { Button } from "primereact/button";
import { ProductContext } from "../contexts/ProductContext";
import ProductForm from "./ProductForm";

const ProductList = () => {

    const {products, findProduct} = useContext(ProductContext)

    const [isVisible, setVisible] = useState(false)

    const saveProduct = (id) => {
        findProduct(id);
        setVisible(true);
      };

    const footer = (
        <div className="p-clearfix" style={{ width: "100%" }}>
          <Button
            style={{ float: "left" }}
            icon="pi pi-plus"
            label="Add"
            onClick={() => setVisible(true)}
          />
        </div>
      );

    return (
        <div>
            <Panel header="LISTA DE PRODUCTOS" style={{textAlign: "center"}}>
                <DataTable
                value={products}
                selectionMode="single"
                onSelectionChange={(e) => saveProduct(e.value._id)}
                footer={footer}
                >
                    <Column field="_id" header="Id"/>
                    <Column field="name" header="Nombre"/>
                    <Column field="precio" header="Precio"/>
                    <Column field="expiry_date" header="Fecha de Caducidad"/>

                </DataTable>
            </Panel>
            <ProductForm isVisible= {isVisible} setVisible={setVisible} />
        </div>
    )
}

export default ProductList
