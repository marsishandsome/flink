package org.apache.flink.table.plan.logical.rel;

import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelTraitSet;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.RelWriter;
import org.apache.calcite.rel.logical.LogicalWindow;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.table.api.StreamTableEnvironment;
import org.apache.flink.table.plan.nodes.datastream.DataStreamRelJava;

import scala.Option;

public class DataStreamWindowRowAggregate extends DataStreamRelJava {

	LogicalWindow window;
	RelTraitSet traitSet;
	RelNode input;
	RelDataType rowType;
	String description;
	
	public DataStreamWindowRowAggregate(RelOptCluster cluster, RelTraitSet traitSet, RelNode input,
			RelDataType rowType, String description,LogicalWindow window) {
		super(cluster, traitSet, input);
		this.window = window;
		this.rowType = rowType;
		this.description = description;
	}

	@Override
	protected RelDataType deriveRowType() {
		// TODO Auto-generated method stub
		return super.deriveRowType();
	}
	
	@Override
	public RelNode copy(RelTraitSet traitSet, java.util.List<RelNode> inputs) {
		// TODO Auto-generated method stub
		return super.copy(traitSet, inputs);
	}
	
	
	
	@Override
	public DataStream<Object> translateToPlan(StreamTableEnvironment tableEnv,
			Option<TypeInformation<Object>> expectedType, Object ignore) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + "window=[" + window + "]" + ")";
	}
	
	@Override
	public void explain(RelWriter pw) {
		// TODO Auto-generated method stub
		super.explain(pw);
	}
	
	@Override
	public RelWriter explainTerms(RelWriter pw) {
	/*	pw.item("Type", winConf.type);
		pw.item("Order", winConf.operateField);
		pw.item("PartitionBy", winConf.partitionBy);
		pw.itemIf("Event-based", winConf.eventWindow, winConf.eventWindow);
		pw.itemIf("Time-based", winConf.timeWindow, winConf.timeWindow);
		pw.item("LowBoundary", winConf.referenceLowBoundary);
		pw.itemIf("LowBoundary constant", winConf.lowBoudary, winConf.lowBoudary != 0);
		pw.item("HighBoundary", winConf.referenceHighBoundary);
		pw.itemIf("HighBoundary constant", winConf.highBoudary, winConf.highBoudary != 0);
	 */
		return pw;
	}
	

	
}
