.class public Lcom/sma/smartv3/ui/device/SearchMapsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSearchMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n55#2,12:187\n84#2,3:199\n1#3:202\n*S KotlinDebug\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n*L\n81#1:187,12\n81#1:199,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n55#2,12:187\n84#2,3:199\n1#3:202\n*S KotlinDebug\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n*L\n81#1:187,12\n81#1:199,3\n*E\n"
    }
.end annotation


# instance fields
.field private isInChinaMainland:Z

.field private final mList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SearchDistrict;",
            ">;"
        }
    .end annotation
.end field

.field private mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/model/SearchDistrict;",
            ">;"
        }
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private placesClient:Lcom/google/android/libraries/places/api/net/PlacesClient;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private searchJob:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final searchView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sx3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sx3;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->searchView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tx3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tx3;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "LOCATION_WHERE"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->isInChinaMainland:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch$lambda$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lcom/google/android/libraries/places/api/model/AutocompletePrediction;Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch$lambda$0$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lcom/google/android/libraries/places/api/model/AutocompletePrediction;Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic X0O(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch$lambda$0$2(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic X1ii(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch$lambda$0$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch$lambda$2(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final synthetic access$getSearchJob$p(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Lkotlinx/coroutines/XiOIO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->searchJob:Lkotlinx/coroutines/XiOIO;

    return-object p0
.end method

.method public static final synthetic access$isInChinaMainland$p(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->isInChinaMainland:Z

    return p0
.end method

.method public static final synthetic access$requestGooglePoiSearch(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setSearchJob$p(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lkotlinx/coroutines/XiOIO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->searchJob:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getSearchView()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->searchView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestPoiSearch(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->requestGooglePoiSearch(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final requestGooglePoiSearch(Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XXIIO1i11()Lcom/sma/smartv3/location/CustomLocation;

    move-result-object v0

    invoke-static {}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;->builder()Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->setQuery(Ljava/lang/String;)Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {p1, v1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->setOrigin(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->build()Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->placesClient:Lcom/google/android/libraries/places/api/net/PlacesClient;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/libraries/places/api/net/PlacesClient;->findAutocompletePredictions(Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ux3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ux3;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vx3;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/vx3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wx3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wx3;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method private static final requestGooglePoiSearch$lambda$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;->getAutocompletePredictions()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;

    sget-object v1, Lcom/google/android/libraries/places/api/model/Place$Field;->LAT_LNG:Lcom/google/android/libraries/places/api/model/Place$Field;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;->getPlaceId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;->builder(Ljava/lang/String;Ljava/util/List;)Lcom/google/android/libraries/places/api/net/FetchPlaceRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/libraries/places/api/net/FetchPlaceRequest$Builder;->build()Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->placesClient:Lcom/google/android/libraries/places/api/net/PlacesClient;

    if-eqz v2, :cond_0

    invoke-interface {v2, v1}, Lcom/google/android/libraries/places/api/net/PlacesClient;->fetchPlace(Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/yx3;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/yx3;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lcom/google/android/libraries/places/api/model/AutocompletePrediction;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zx3;

    invoke-direct {v0, v2}, Lcom/android/mltcode/paycertificationapi/zx3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ay3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/ay3;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final requestGooglePoiSearch$lambda$0$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lcom/google/android/libraries/places/api/model/AutocompletePrediction;Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;)Lkotlin/Unit;
    .locals 8

    invoke-virtual {p2}, Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;->getPlace()Lcom/google/android/libraries/places/api/model/Place;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/libraries/places/api/model/Place;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    new-instance v1, Lcom/sma/smartv3/model/SearchDistrict;

    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p1, v2}, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;->getPrimaryText(Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v2

    invoke-virtual {v2}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "toString(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Landroid/text/style/StyleSpan;

    invoke-direct {v5, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p1, v5}, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;->getFullText(Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object p1

    invoke-virtual {p1}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v4, p2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v6, p2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/SearchDistrict;-><init>(Ljava/lang/String;Ljava/lang/String;DD)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final requestGooglePoiSearch$lambda$0$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final requestGooglePoiSearch$lambda$0$2(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u83b7\u53d6\u5730\u70b9\u4fe1\u606f\u5931\u8d25: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "SearchMapsActivity"

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    return-void
.end method

.method private static final requestGooglePoiSearch$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final requestGooglePoiSearch$lambda$2(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exception : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SearchMapsActivity"

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method private static final searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0a01

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method


# virtual methods
.method public final getMList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SearchDistrict;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    return-object v0
.end method

.method public final getMListAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/model/SearchDistrict;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->isInChinaMainland:Z

    if-nez p1, :cond_1

    invoke-static {}, Lcom/google/android/libraries/places/api/Places;->isInitialized()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f140c6f

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/libraries/places/api/Places;->initialize(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, Lcom/google/android/libraries/places/api/Places;->createClient(Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->placesClient:Lcom/google/android/libraries/places/api/net/PlacesClient;

    :cond_1
    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-searchView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/SearchMapsActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f0a0a00

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xx3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xx3;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    new-instance v1, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$3;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$3;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00f7

    return v0
.end method

.method public final onSearchGeography(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "SEARCH_BD_GEOGRAPHY_RESULT"
    .end annotation

    const-string v0, "listJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    new-instance v0, Lcom/sma/smartv3/ui/device/SearchMapsActivity$XIi00iiXO;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity$XIi00iiXO;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mList:Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public requestPoiSearch(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "keyword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SEARCH_BD_GEOGRAPHY"

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final setMListAdapter(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;)V
    .locals 0
    .param p1    # Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/model/SearchDistrict;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->mListAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-void
.end method
