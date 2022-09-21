package com.tupaginaturistica.appturistica.repository;

import com.tupaginaturistica.appturistica.entity.Profiles;
import com.tupaginaturistica.appturistica.entity.enums.ProfilesName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profiles,Integer> {

    Optional<Profiles> findById(ProfilesName profilesName);
}
