.class public Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;
.super Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment<",
        "Lcom/sma/smartv3/model/SportRecordData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportRecordsV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n19#2:309\n15#2:310\n1669#3,8:311\n257#4,2:319\n257#4,2:321\n99#5,7:323\n106#5,3:331\n79#5,7:334\n109#5:341\n99#5,7:342\n106#5,3:350\n79#5,7:353\n109#5:360\n99#5,7:361\n106#5,3:369\n79#5,7:372\n109#5:379\n1#6:330\n1#6:349\n1#6:368\n*S KotlinDebug\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n*L\n53#1:309\n53#1:310\n121#1:311,8\n303#1:319,2\n148#1:321,2\n253#1:323,7\n253#1:331,3\n253#1:334,7\n253#1:341\n256#1:342,7\n256#1:350,3\n256#1:353,7\n256#1:360\n258#1:361,7\n258#1:369,3\n258#1:372,7\n258#1:379\n253#1:330\n256#1:349\n258#1:368\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportRecordsV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n19#2:309\n15#2:310\n1669#3,8:311\n257#4,2:319\n257#4,2:321\n99#5,7:323\n106#5,3:331\n79#5,7:334\n109#5:341\n99#5,7:342\n106#5,3:350\n79#5,7:353\n109#5:360\n99#5,7:361\n106#5,3:369\n79#5,7:372\n109#5:379\n1#6:330\n1#6:349\n1#6:368\n*S KotlinDebug\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n*L\n53#1:309\n53#1:310\n121#1:311,8\n303#1:319,2\n148#1:321,2\n253#1:323,7\n253#1:331,3\n253#1:334,7\n253#1:341\n256#1:342,7\n256#1:350,3\n256#1:353,7\n256#1:360\n258#1:361,7\n258#1:369,3\n258#1:372,7\n258#1:379\n253#1:330\n256#1:349\n258#1:368\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "SportRecordsV2Fragment"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private competitionSelectionTime:Z

.field private mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalCalorie$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalCalorieUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalDuration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalDurationUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalSize$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalSizeUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTotalTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private page:I

.field private final pageNumber:I

.field private sportRecordList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->Companion:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;-><init>()V

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    const/16 v1, 0xc8

    iput v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->pageNumber:I

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/f45;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/f45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalTitle$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/g45;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/g45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalDuration$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h45;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/h45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalDurationUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i45;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalLayout$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j45;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/j45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalSize$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k45;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/k45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalSizeUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l45;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/l45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalCalorie$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/x35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/x35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalCalorieUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->setInitUpdate(Z)V

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setAdapter$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalDurationUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalCalorie_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->findData$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->findData$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->findData$lambda$0$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->findData$lambda$0$0$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalCalorieUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->findData$lambda$0$1(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setAdapter$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalSizeUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/ArrayList;)V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n",
            "ClickableViewAccessibility"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/angcyo/dsladapter/DslAdapter;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalSize()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "next(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-static {v5, v6, v4}, Lcom/sma/smartv3/model/SportRecordDataKt;->parseSportRecordItemCommonData(Landroid/content/Context;Lcom/sma/smartv3/model/AppUser;Lcom/sma/smartv3/model/SportRecordData;)Lcom/sma/smartv3/model/SportRecordItemCommonData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getMDuration()I

    move-result v6

    add-int/2addr v2, v6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getMCalorie()I

    move-result v6

    add-int/2addr v3, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SportRecordsV2Fragment itemData=="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getItemLayout()I

    move-result v6

    new-instance v7, Lcom/android/mltcode/paycertificationapi/z35;

    invoke-direct {v7, p0, v5, v4, p1}, Lcom/android/mltcode/paycertificationapi/z35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapter;)V

    invoke-static {p1, v6, v7}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalDuration()Landroid/widget/TextView;

    move-result-object v4

    mul-int/lit16 v5, v2, 0x3e8

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XOX0O0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalCalorie()Landroid/widget/TextView;

    move-result-object v4

    div-int/lit16 v5, v3, 0x3e8

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalLayout()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static final findData$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 7

    const-string v0, "$this$dslItem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p4, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b45;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/b45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;)V

    invoke-virtual {v5, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/c45;

    invoke-direct {p0, v2, v4, v5}, Lcom/android/mltcode/paycertificationapi/c45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {v5, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p6, "itemHolder"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "<unused var>"

    invoke-static {p7, p6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p8, p6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p5, p1, p2}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setItemView(Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;)V

    move-object p1, p2

    move-object p2, p3

    move-object p3, p5

    move-object p5, p4

    move-object p4, p0

    new-instance p0, Lcom/android/mltcode/paycertificationapi/d45;

    invoke-direct/range {p0 .. p5}, Lcom/android/mltcode/paycertificationapi/d45;-><init>(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)V

    const p1, 0x7f0a019b

    invoke-virtual {p3, p1, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const p0, 0x7f0a06fe

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/e45;

    invoke-direct {p1, p3}, Lcom/android/mltcode/paycertificationapi/e45;-><init>(Lcom/angcyo/dsladapter/DslViewHolder;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/model/SportRecordDataKt;->deleteSportRecord(Lcom/sma/smartv3/model/SportRecordData;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p2}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    :cond_0
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p2, 0x2

    const/4 p5, 0x0

    if-eqz p0, :cond_1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2, p5}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;ZILjava/lang/Object;)V

    :cond_1
    invoke-direct {p3}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalSize()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lcom/angcyo/dsladapter/DslAdapter;->getDataItems()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_0

    :cond_2
    move-object p3, p5

    :goto_0
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p3, 0x1

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapter;->getDataItems()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_3

    invoke-static {p4, p3, p5, p2, p5}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    :cond_3
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0, p5, p3, p5}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method private static final findData$lambda$0$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final findData$lambda$0$1(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 6

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result v0

    const-string v1, "mArg1"

    const-string v2, "mArg3"

    const-string v3, "mArg2"

    const-string v4, "mArg0"

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p1

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v3, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v2, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/i72;->XII01OO1I()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p1

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v3, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v2, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v2, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    :goto_0
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p0

    if-eqz p0, :cond_2

    const/4 p1, 0x1

    invoke-static {p0, v5, p1, v5}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu$default(Lcom/angcyo/dsladapter/SwipeMenuHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V

    :cond_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getMTotalCalorie()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalCalorie$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMTotalCalorieUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalCalorieUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMTotalDuration()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalDuration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMTotalDurationUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalDurationUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMTotalLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMTotalSize()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalSize$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMTotalSizeUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalSizeUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMTotalTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTotalSize_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setAdapter$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final mTotalCalorieUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b01

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTotalCalorie_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b00

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTotalDurationUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b03

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTotalDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b02

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTotalLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b04

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mTotalSizeUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b06

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTotalSize_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b05

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTotalTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b07

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final onVisibility(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 1

    const v0, 0x7f0a0a9e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const v0, 0x7f0a0a9f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public static synthetic onVisibility$default(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslViewHolder;IILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->onVisibility(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onVisibility"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final setAdapter$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslAdapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/BaseDslStateItem;->getItemStateLayoutMap()Ljava/util/HashMap;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f0d0f5d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a45;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/w35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/w35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalLayout()Landroid/view/View;

    move-result-object p0

    const-string p1, "<get-mTotalLayout>(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMoreEnable(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public adapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/dsl/AdapterStatusItem;

    invoke-direct {v0}, Lcom/sma/smartv3/dsl/AdapterStatusItem;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->setAdapterStatus(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getAdapterStatus()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    return-object v0
.end method

.method public final getCompetitionSelectionTime()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->competitionSelectionTime:Z

    return v0
.end method

.method public getItemLayout()I
    .locals 1

    const v0, 0x7f0d107b

    return v0
.end method

.method public getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-object v0
.end method

.method public final getSportRecordList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getSportRecordList()V
    .locals 6

    .line 2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 3
    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->page:I

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->pageNumber:I

    const/16 v2, 0x74

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordListByMode(III)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    .line 4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140c36

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_0
    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->page:I

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->pageNumber:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(II)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    .line 6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1412a5

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    .line 8
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 11
    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/model/SportRecordData;

    .line 12
    invoke-virtual {v4}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 13
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 14
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 15
    :cond_2
    iput-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->init(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    return-void
.end method

.method public initView()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalDurationUnit()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f140060

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f140f5d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalSizeUnit()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f14104c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalCalorieUnit()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f141150

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f140d64

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getSportRecordList()V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e7e

    return v0
.end method

.method public onDataChange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->onInitBaseLayoutAfter()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTotalLayout()Landroid/view/View;

    move-result-object p1

    const-string v0, "<get-mTotalLayout>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->onDestroy()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OiIIX101O(Ljava/lang/Object;)V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->onInitBaseLayoutAfter()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslViewHolder:Lcom/angcyo/dsladapter/DslViewHolder;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setAdapter()V

    :cond_0
    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 9
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/util/TimePeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "I",
            "Lcom/sma/smartv3/util/TimePeriod;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->competitionSelectionTime:Z

    invoke-static {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result p2

    const/4 p3, -0x1

    const/4 v1, 0x0

    if-le p2, p3, :cond_0

    aget-wide p2, p1, v1

    aget-wide v2, p1, v0

    const/16 v0, 0x74

    invoke-static {p2, p3, v2, v3, v0}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(JJI)Ljava/util/ArrayList;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    aget-wide v2, p1, v1

    aget-wide v4, p1, v0

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList$default(JJIILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    :goto_0
    aget-wide p2, p1, v1

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTimePeriodChange "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, "  "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    return-object p1
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final setAdapter()V
    .locals 3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/y35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lcom/angcyo/dsladapter/SwipeMenuHelper;->Companion:Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->recyclerViewId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;->OXO1(Landroidx/recyclerview/widget/RecyclerView;)Lcom/angcyo/dsladapter/SwipeMenuHelper;

    return-void
.end method

.method public final setCompetitionSelectionTime(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->competitionSelectionTime:Z

    return-void
.end method

.method public setItemView(Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;)V
    .locals 7
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/SportRecordItemCommonData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportRecordData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0ae5

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutImg()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    const v0, 0x7f0a0a9a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutModeName()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    const v0, 0x7f0a0ade

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getSportStartTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/hu4;->OXO1:Lcom/android/mltcode/paycertificationapi/hu4;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v1

    invoke-virtual {p3}, Lcom/sma/smartv3/model/SportRecordData;->getMPlatform()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->XO0O10(ILjava/lang/String;)Z

    move-result v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result p3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SportRecordsV2Fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    const/16 p3, 0x8

    const v1, 0x7f0a0a90

    const v2, 0x7f0a0a8e

    if-eqz v0, :cond_5

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getMDistance()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v6, v4, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_4
    invoke-direct {p0, p1, p3}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->onVisibility(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getMCalorie()I

    move-result v2

    div-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_7

    const v1, 0x7f140d64

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-direct {p0, p1, p3}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->onVisibility(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    :goto_0
    const p3, 0x7f0a0a8f

    invoke-virtual {p1, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getMDuration()I

    move-result p2

    mul-int/lit16 p2, p2, 0x3e8

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    return-void
.end method

.method public setMTimePeriod(Lcom/sma/smartv3/util/TimePeriod;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/util/TimePeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-void
.end method

.method public final setSportRecordList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    return-void
.end method

.method public final syncDeleteSport(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "sync_delete_sport"
    .end annotation

    const-string v0, "any"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->sportRecordList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->initView()V

    return-void
.end method
