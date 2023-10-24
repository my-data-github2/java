package com.sunbeam;

import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		try (CandidateDao dao = new CandidateDao()) {

			Scanner sc = new Scanner(System.in);

			//Increment vote
//			System.out.print("Enter candidate id (to vote): ");
//			int candidateId = sc.nextInt();
//			int cnt = dao.incrementVote(candidateId);
//			System.out.println("Rows updated: " + cnt);

			//Add a candidate
//			System.out.print("Enter candidate name: ");
//			String newName = sc.nextLine();
//			System.out.print("Enter party name: ");
//			String newParty = sc.nextLine();
//			int cnt = dao.add(newName, newParty);
//			System.out.println("Candidate Added: "+cnt);

			//Upadte a candidate
//			System.out.print("Enter Candidate id for update: ");
//			int newId = sc.nextInt();
//			System.out.println("Update Candidate name: ");
//			String newName = sc.next();
//			int cnt = dao.update(newName,newId);
//			System.out.println("Candidate details updated: "+cnt);

			//Getparty Wise Vote
//			List<PartyVotes> list = dao.partyVotes();
//			list.forEach(pv -> System.out.println(pv));

			//Delete a candidate
//			System.out.print("Enter candidate id (to delete): ");
//			int candidateId = sc.nextInt();
//			int cnt = dao.deleteById(candidateId);
//			System.out.println("Rows updated: " + cnt);
			
			//findall
//           List<Candidate> list = dao.findAll();
//     		 list.forEach(c -> System.out.println(c));
			
			//get votes by given partywise
			System.out.print("Enter party: ");
			String party = sc.next();
			List<PartyVotes> list = dao.getCandidatesFromGivenParty(party);
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
