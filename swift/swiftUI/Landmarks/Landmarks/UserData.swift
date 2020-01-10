//
//  UserData.swift
//  Landmarks
//
//  Created by Wayne Covell on 28/07/2019.
//  Copyright © 2019 Apple. All rights reserved.
//

import Foundation
import SwiftUI
import Combine

final class UserData: Combine.ObservableObject {
    let willChange = PassthroughSubject<Void, Never>()
    
    var showFavoritesOnly = false {
        willSet {
            willChange.send();
        }
    }
    
    var landmarks = landmarkData {
        willSet {
            willChange.send();
        }
    }
}


