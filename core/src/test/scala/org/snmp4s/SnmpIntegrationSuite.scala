/*
 * Copyright 2013 org.snmp4s
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance 
 * with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is 
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and limitations under the License.
 */

package org.snmp4s

import java.io.File
import org.scalatest.{WordSpec, BeforeAndAfter}
import org.scalatest.matchers.{ShouldMatchers}
import Mib._

class SnmpIntegrationSuite extends WordSpec with ShouldMatchers with BeforeAndAfter {
  val snmp = new SnmpSync(SnmpParams())
  
  var ta:Option[TestAgent] = None
  
  before {
    ta = Some(TestAgent.start("127.0.0.1/161"))
  }
  
  after {
    ta map ( _.stop )
    ta = None
  }
  
  import snmp._
  import TestMibs._
  import IfMib._
  import AgentppSimulationMib._
  
  "A synchronous Snmp" should {
//    "be able to read value 1 from agentppSimMode on our simulator" in {
//      import AgentppSimMode_enum._
//      
//      get(AgentppSimMode(0)) should equal (Right(Oper))
//    }
//    
//    "be able to set value 2 on Read-Write OID agentppSimMode, read it back, and set it back to 1 on our simulator" in {
//      import AgentppSimMode_enum._
//      get(AgentppSimMode) should equal (Right(Oper))
//      set(AgentppSimMode to Config) should equal (None)
//      get(AgentppSimMode) should equal (Right(Config))
//      set(AgentppSimMode to Oper) should equal (None)
//      get(AgentppSimMode) should equal (Right(Oper))
//    }
//    
//    "be able to get Read-Only OID ifIndex.1" in {
//      get(IfIndex(1)) should equal (Right(1))
//    }
//    
//    "be able to get String syntax OID ifDescr" in {
//      get(IfDescr(1)) should equal (Right("eth0"))
//      get(IfDescr(2)) should equal (Right("loopback"))
//    }
//    
//    "be able to walk on Read-Only OID ifIndex" in {
//      walk(IfIndex) should equal (Right(Seq(
//        IfIndex(1) vb 1,
//        IfIndex(2) vb 2
//      )))
//    }
//    
//    "be able to walk on Read-Write enum OID ifAdminStatus" in {
//      import IfAdminStatus_enum._
//      walk(IfAdminStatus) should equal (Right(Seq(
//        IfAdminStatus(1) vb Up,
//        IfAdminStatus(2) vb Up
//      )))
//    }
//    
//    "be able to get/set an enumerated value" in {
//      import IfAdminStatus_enum._
//      
//      get(IfAdminStatus(1)) should equal (Right(Up))
//      set(IfAdminStatus(1) to Down) should equal (None)
//      get(IfAdminStatus(1)) should equal (Right(Down))
//      set(IfAdminStatus(1) to Up) should equal (None)
//      get(IfAdminStatus(1)) should equal (Right(Up))
//    }
//    
//    "be able to walk on String syntax OID ifDescr" in {
//      walk(IfDescr) should equal (Right(Seq(
//        IfDescr(1) vb "eth0",
//        IfDescr(2) vb "loopback"
//      )))
//    }
//    
//    "be able to set String syntax Read-Write OID ifAlias" in {
//      get(IfAlias(1)) should equal (Right("My eth"))
//      set(IfAlias(1) to "Your eth") should equal (None)
//      get(IfAlias(1)) should equal (Right("Your eth"))
//    }
//    
//    "be able to pattern match against an OID" in {
//      import IfAdminStatus_enum._
//      set(IfAdminStatus(2) to Testing)
//      walk(IfAdminStatus) match {
//        case Right(walk) => {
//          val testPorts = for(VarBind(IfAdminStatus(Seq(i)), Testing) <- walk) yield i
//          
//          testPorts should equal (Seq(2))
//        }
//        
//        case Left(err) => fail
//      }
//
//    }
//    
//    "handle errors" in {
//      import IfAdminStatus_enum._
//      get(MyReadOnlyOid(1)) should equal (Left(NoSuchName))
//      set(MyReadWriteOid(2) to 42) should equal (Some(NoSuchName))
//      walk(MyReadOnlyOid) should equal(Right(Seq()))
//
//      // The WrongValue is the best we can do with SNMP4J. Even though there are 2 OIDs which have
//      // errored, SNMP4J only reports 1.
//      get(IfAdminStatus(1), MyReadOnlyOid(1), IfAdminStatus(2), IfAdminStatus(3)) should equal (
//        Right(Right(Up), Left(NoSuchName), Right(Up), Left(WrongValue))
//      )
//      get(IfAdminStatus(3)) should equal (Left(NoSuchName))
//      
//      val unresolvedName = new SnmpSync(SnmpParams("invalid"))
//      unresolvedName.walk(IfAdminStatus) should equal (Left(AgentUnknown))
//      unresolvedName.get(IfAdminStatus(1)) should equal (Left(AgentUnknown))
//      unresolvedName.set(IfAdminStatus(2) to Testing) should equal (Some(AgentUnknown))
//      
//      ta map { _ stop }; ta = None      
//      
//      walk(IfAdminStatus) should equal (Left(AgentUnreachable))
//      get(IfAdminStatus(1)) should equal (Left(AgentUnreachable))
//      set(IfAdminStatus(2) to Testing) should equal (Some(AgentUnreachable))
//    }
//    
//    "Get multiple OIDs of the same type" in {
//      get(Seq(
//        IfIndex(1),
//        IfIndex(2),
//        IfInMulticastPkts(1),
//        IfInMulticastPkts(2),
//        IfInBroadcastPkts(1),
//        IfInBroadcastPkts(2)
//      )) should equal (Right(Seq(
//        Right(1),
//        Right(2),
//        Right(1),
//        Right(21),
//        Right(2),
//        Right(22)
//      )))
//
//      // TODO: Make this work
////      get(Seq(
////        IfDescr(1),
////        IfAlias(1),
////        IfDescr(2),
////        IfAlias(2)
////      )) should equal (Right(Seq(
////        Right("eth0"),
////        Right("My eth"),
////        Right("loopback"),
////        Right("My loop")
////      )))
//    }
//    
//    "Get multiple OIDs of different types" in {
//      val res = get(
//        IfIndex(1),
//        IfDescr(1),
//        IfType(1),
//        IfMtu(1),
//        IfSpeed(1),
//        IfPhysAddress(1),
//        IfAdminStatus(1),
//        IfOperStatus(1),
//        IfName(1),
//        IfInMulticastPkts(1),
//        IfAlias(1),
//        
//        IfIndex(2),
//        IfDescr(2),
//        IfType(2),
//        IfMtu(2),
//        IfSpeed(2),
//        IfPhysAddress(2),
//        IfAdminStatus(2),
//        IfOperStatus(2),
//        IfName(2),
//        IfInMulticastPkts(2),
//        IfAlias(2)
//      )
//      
//      res should equal (Right((
//        Right(1),
//        Right("eth0"),
//        Right(IfType_enum.EthernetCsmacd),
//        Right(1500),
//        Right(100000000),
//        Right("00:00:00:00:01"),
//        Right(IfAdminStatus_enum.Up),
//        Right(IfOperStatus_enum.Up),
//        Right("Ethernet-0"),
//        Right(1),
//        Right("My eth"),
//        
//        Right(2),
//        Right("loopback"),
//        Right(IfType_enum.SoftwareLoopback),
//        Right(1500),
//        Right(10000000),
//        Right("00:00:00:00:02"),
//        Right(IfAdminStatus_enum.Up),
//        Right(IfOperStatus_enum.Up),
//        Right("Loopback"),
//        Right(21),
//        Right("My loop")
//      )))
//    }
//    
//    "Slap an index on a list of like-typed OIDs and get them" in {
//      get(Seq(IfDescr, IfPhysAddress, IfName), 1, 2) should equal (Right(Seq(
//        Right("eth0"),
//        Right("00:00:00:00:01"),
//        Right("Ethernet-0"),
//        
//        Right("loopback"),
//        Right("00:00:00:00:02"),
//        Right("Loopback")
//      )))
//    }
//    
//    "Set multiple OIDs of the same type" in {
//      import IfAdminStatus_enum._
//      set(Seq(
//        IfAdminStatus(1) to Testing,
//        IfAdminStatus(2) to Down
//      )) should equal (None)
//      
//      get(IfAdminStatus(1), IfAdminStatus(2)) should equal (Right((
//        Right(Testing), Right(Down)
//      )))
//    }
//    
//    "Set multiple OIDs of different types" in {
//      import IfAdminStatus_enum._
//      set(
//        IfAlias(1) to "Alias1",
//        IfAlias(2) to "Alias2",
//        IfAdminStatus(1) to Testing,
//        IfAdminStatus(2) to Down
//      ) should equal (None)
//      
//      get(IfAlias(1), IfAlias(2), IfAdminStatus(1), IfAdminStatus(2)) should equal (Right((
//        Right("Alias1"), Right("Alias2"), Right(Testing), Right(Down)
//      )))
//    }
    
    "do a get against GetRequest" in {
      import scala.util. {Right => V, Left => E}
      val get1:Either[SnmpError,GetResponse[Int]] = get(IfIndex(1)) 
      get1 should equal (V(SingleGetResponse(V(1))))
      val get3 = get(IfIndex(1) &: IfIndex(2) &: IfAlias(1))

      get3 match {
        case V(V(v1) &: V(v2) &: v3) => 
        case _ => fail("did not return correct values")
      } 
    }
    
    "do a set with one VarBind" in {
      val set1:VarBind[ReadWrite,String] = IfAlias(1) to "Set Test"
      set(set1) match {
        case Some(e) => fail("SNMP set failed")
        case _ =>
      }

      get(IfAlias(1)) match {
        case Right(v) => v should equal (SingleGetResponse(Right("Set Test")))
        case _ =>
      }
    }
  }
}