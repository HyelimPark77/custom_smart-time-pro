.class public final Lcom/sma/smartv3/ui/device/GameMemberActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameMemberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n93#2,2:224\n90#2:226\n93#2,2:227\n90#2:229\n1869#3:230\n1869#3,2:231\n1870#3:233\n1563#3:234\n1634#3,3:235\n*S KotlinDebug\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n*L\n45#1:222\n45#1:223\n98#1:224,2\n98#1:226\n110#1:227,2\n110#1:229\n159#1:230\n174#1:231,2\n159#1:233\n138#1:234\n138#1:235,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameMemberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n93#2,2:224\n90#2:226\n93#2,2:227\n90#2:229\n1869#3:230\n1869#3,2:231\n1870#3:233\n1563#3:234\n1634#3,3:235\n*S KotlinDebug\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n*L\n45#1:222\n45#1:223\n98#1:224,2\n98#1:226\n110#1:227,2\n110#1:229\n159#1:230\n174#1:231,2\n159#1:233\n138#1:234\n138#1:235,3\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final appUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mMemberBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mUserAvatar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mUserMemberTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mUserName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v1, "GameMemberActivity"

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->TAG:Ljava/lang/String;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0O1I1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O0O1I1;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserAvatar$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iIOXXXOO;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iIOXXXOO;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserName$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0ii0XIIX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i0ii0XIIX;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserMemberTime$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0iXXI11;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/X0iXXI11;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mMemberBtn$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData$lambda$0$0$1(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData$lambda$0$0$0(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData$lambda$0$1$0(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserMemberTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->showList$lambda$0$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Ljava/util/List;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->showList$lambda$0$0$0(Ljava/util/List;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData$lambda$0$1$0$1(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->getServerData$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData$lambda$0$0(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData$lambda$0$1$0$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData$lambda$0$1$0$0$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->showList$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method private static final findData$lambda$0$0(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    invoke-virtual {p0}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOI1ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOI1ii;-><init>(Lcom/tenmeter/smlibrary/entity/SMIconListParent;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1O0O;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/I1O0O;-><init>(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0cc7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$1(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    invoke-virtual {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/i0O111;->XiOIO(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Landroid/app/Activity;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$1$0(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/X00Oi0;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/X00Oi0;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/X1XI0I0X;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/X1XI0I0X;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$1$0$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "adapterItem"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payloads"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0591

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    if-eqz p3, :cond_0

    new-instance p4, Lcom/bumptech/glide/request/RequestOptions;

    invoke-direct {p4}, Lcom/bumptech/glide/request/RequestOptions;-><init>()V

    new-instance p5, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    const/16 v0, 0x14

    invoke-direct {p5, v0}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    invoke-virtual {p4, p5}, Lcom/bumptech/glide/request/BaseRequestOptions;->transform(Lcom/bumptech/glide/load/Transformation;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p4

    const-string p5, "transform(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lcom/bumptech/glide/request/RequestOptions;

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object p5

    invoke-virtual {p1}, Lcom/tenmeter/smlibrary/entity/SMGameInfo;->getBackground()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p5

    invoke-virtual {p5, p4}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    new-instance p4, Lcom/android/mltcode/paycertificationapi/iOiiiiI1;

    invoke-direct {p4, p0, p1}, Lcom/android/mltcode/paycertificationapi/iOiiiiI1;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;)V

    invoke-virtual {p3, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const p3, 0x7f0a0593

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/tenmeter/smlibrary/entity/SMGameInfo;->getGname()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p3, 0x7f0a0590

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Lcom/tenmeter/smlibrary/entity/SMGameInfo;->getDetails()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const p3, 0x7f0a0592

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lcom/tenmeter/smlibrary/entity/SMGameInfo;->getPlayNum()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const p3, 0x7f140c37

    invoke-virtual {p0, p3, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$1$0$0$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Landroid/view/View;)V
    .locals 0

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/i0O111;->IIX1OXO(Landroid/app/Activity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;)V

    return-void
.end method

.method private static final findData$lambda$0$1$0$1(Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/i0O111;->IIX1OXO(Landroid/app/Activity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getMMemberBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mMemberBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMUserAvatar()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserAvatar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMUserMemberTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserMemberTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMUserName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mUserName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getServerData()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0XiO1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I0XiO1;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/OrderManager;->O1O(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final getServerData$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->initView()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->mMemberBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method private static final mMemberBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final mUserAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0408

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mUserMemberTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a040a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mUserName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a040b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final showList$lambda$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i10XX;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/i10XX;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;)V

    const-wide/16 p0, 0x12c

    invoke-virtual {p2, p0, p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXOX0O0O1;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/XXOX0O0O1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Ljava/util/List;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 6

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v1, v2, v0, v2}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    move-object p2, p0

    check-cast p2, Ljava/util/Collection;

    const/16 v0, 0x8

    if-eqz p2, :cond_5

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto/16 :goto_3

    :cond_0
    move-object p2, p0

    check-cast p2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p2, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v4, 0x1

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tenmeter/smlibrary/entity/SMIconListParent;

    invoke-virtual {v5}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getGameList()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-lez v5, :cond_2

    move v4, v1

    :cond_2
    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->findData(Ljava/util/List;)V

    :goto_2
    sget-object p0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/GameMemberActivity;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " isEmptyData = "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final findData(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/tenmeter/smlibrary/entity/SMIconListParent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tenmeter/smlibrary/entity/SMIconListParent;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IO101O1;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/IO101O1;-><init>(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    const v3, 0x7f0d0f56

    invoke-static {v1, v3, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-virtual {v0}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getGameList()Ljava/util/List;

    move-result-object v1

    const-string v2, "getGameList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tenmeter/smlibrary/entity/SMGameInfo;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v3

    new-instance v4, Lcom/android/mltcode/paycertificationapi/iIi0X1II;

    invoke-direct {v4, v0, p0, v2}, Lcom/android/mltcode/paycertificationapi/iIi0X1II;-><init>(Lcom/tenmeter/smlibrary/entity/SMIconListParent;Lcom/sma/smartv3/ui/device/GameMemberActivity;Lcom/tenmeter/smlibrary/entity/SMGameInfo;)V

    const v2, 0x7f0d0ee4

    invoke-static {v3, v2, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 14

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0601f7

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setStatusBarColor(Landroid/app/Activity;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getAvatarUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getAvatarUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    const v1, 0x7f081568

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->error(I)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/RequestBuilder;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->getMUserAvatar()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->getMUserName()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "USER_MEMBER"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5f

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v6, Lcom/sma/smartv3/model/UserMember;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    check-cast v1, Lcom/sma/smartv3/model/UserMember;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->getMUserMemberTime()Landroid/widget/TextView;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/i0O111;->OII(Lcom/sma/smartv3/model/UserMember;)Z

    move-result v7

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_2

    const v7, 0x7f141491

    invoke-virtual {p0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I0IIOi()Ljava/text/SimpleDateFormat;

    move-result-object v10

    new-instance v11, Ljava/util/Date;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/UserMember;->getLatestGameMemberDateTime()J

    move-result-wide v12

    invoke-direct {v11, v12, v13}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v10, v11}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/sma/smartv3/model/UserMember;->getLatestGameMemberDateTime()J

    move-result-wide v10

    cmp-long v1, v10, v8

    if-lez v1, :cond_3

    const v1, 0x7f140c2d

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    const v1, 0x7f140c2f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0a0023

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f140c33

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_4
    check-cast v0, Lcom/sma/smartv3/model/UserMember;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->getMMemberBtn()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getLatestGameMemberDateTime()J

    move-result-wide v4

    cmp-long v2, v4, v8

    if-lez v2, :cond_6

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/i0O111;->OII(Lcom/sma/smartv3/model/UserMember;)Z

    move-result v0

    if-eqz v0, :cond_5

    const v0, 0x7f140c31

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    const v0, 0x7f14118d

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_6
    const v0, 0x7f140c30

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    :cond_7
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00a6

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i0O111;->iIiiO(Landroid/app/Activity;)V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    new-instance v1, Lcom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i0O111;->I0iXXO(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public final onOrderPayStatusChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ORDER_PAY_SUCCESS"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onOrderPayStatusChange"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->getServerData()V

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

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a0409

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final showList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/tenmeter/smlibrary/entity/SMIconListParent;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIX1iXXi;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/OIX1iXXi;-><init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
