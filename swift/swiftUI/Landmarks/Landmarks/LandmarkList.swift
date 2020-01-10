/*
 See LICENSE folder for this sample’s licensing information.
 
 Abstract:
 A view showing a list of landmarks.
 */

import SwiftUI

struct LandmarkList: View {
    @EnvironmentObject var userData: UserData
    
    init() {
        UIView.appearance().backgroundColor = .darkGray
        UIView.appearance().tintColor = .white
        UINavigationBar.largeTitleTextAttributes = [.foregroundColor: UIColor.white]
    }
    
    
    var body: some View {
        ZStack {
            NavigationView {
                List {
                    Toggle(isOn: $userData.showFavoritesOnly) {
                        Text("Favourites")
                    }
                    ForEach(userData.landmarks) { landmark in
                        if !self.userData.showFavoritesOnly || landmark.isFavorite {
                            NavigationLink(destination: LandmarkDetail(landmark: landmark)) {
                                LandmarkRow(landmark: landmark)
                            }
                        }
                    }
                }
                .navigationBarTitle(Text("Landmarks").foregroundColor(Color.white), displayMode: .large)
                .foregroundColor(Color.white)
            }
            
        }
        
    }
    
}


#if DEBUG
struct LandmarkList_Previews: PreviewProvider {
    static var previews: some View {
        ForEach(["iPhone XS Max"], id: \.self) { deviceName in
            LandmarkList()
                .environmentObject(UserData())
                .previewDevice(PreviewDevice(rawValue: deviceName))
                .previewDisplayName(deviceName)
        }
    }
}
#endif
