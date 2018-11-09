package sample2.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.reactivestreams.Publisher;

import io.micronaut.security.authentication.AuthenticationFailed;
import io.micronaut.security.authentication.AuthenticationProvider;
import io.micronaut.security.authentication.AuthenticationRequest;
import io.micronaut.security.authentication.AuthenticationResponse;
import io.micronaut.security.authentication.UserDetails;
import io.reactivex.Flowable;

@Singleton
public class AuthenticationService implements AuthenticationProvider {


	@Override
	public Publisher<AuthenticationResponse> authenticate(AuthenticationRequest authenticationRequest) {

		if(authenticationRequest.getIdentity().equals("login") && authenticationRequest.getSecret().equals("pwd")) {

			List<String> roles = new ArrayList<String>();
			roles.add("ROLE_1");

			UserDetails userDetails = new UserDetails((String) authenticationRequest.getIdentity(), roles);
			return Flowable.just(userDetails);
		}
		return Flowable.just(new AuthenticationFailed());
	}
}
