.class public final Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportShowDataSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,384:1\n19#2:385\n15#2:386\n85#2,3:387\n94#2:390\n90#2:391\n*S KotlinDebug\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n*L\n33#1:385\n33#1:386\n72#1:387,3\n139#1:390\n139#1:391\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportShowDataSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,384:1\n19#2:385\n15#2:386\n85#2,3:387\n94#2:390\n90#2:391\n*S KotlinDebug\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n*L\n33#1:385\n33#1:386\n72#1:387,3\n139#1:390\n139#1:391\n*E\n"
    }
.end annotation


# instance fields
.field private final itemDesc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportCallback$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

.field private type:Lcom/sma/smartv3/ui/sport/SportDataType;

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/e65;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/e65;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->itemValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/f65;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/f65;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->itemDesc$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/g65;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/g65;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->mSportCallback$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$3$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$5$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    return-void
.end method

.method public static synthetic II1Xi0(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$2$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$3(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$10$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$6$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$7(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$6$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$3$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$8(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$1$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$2$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X100O(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$5(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$1(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$10$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->mSportCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$4$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX1Oi(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$9$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$4(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->itemDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXO(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$7$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$0$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$5$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$2(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getType$p(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/ui/sport/SportDataType;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->type:Lcom/sma/smartv3/ui/sport/SportDataType;

    return-object p0
.end method

.method public static final synthetic access$showItemValue(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showItemValue(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V

    return-void
.end method

.method private final getMSportCallback()Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->mSportCallback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;

    return-object v0
.end method

.method private final getOneContent(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)Lkotlin/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/SportDataType;",
            "Lcom/sma/smartv3/db/entity/SportData;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMSpeed()I

    move-result p2

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {p2, v3, v2, v1, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f141287

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_1
    new-instance p1, Lkotlin/Pair;

    sget-object p2, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/XO0O10;->iI()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f140cb6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_2
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMAltitude()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f140120

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMSpm()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f14128d

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_4
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMStep()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f1412c6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMCalorie()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f140274

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMPace()I

    move-result p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {p2, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f14108b

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_7
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDistance()I

    move-result p2

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {p2, v3, v2, v1, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f140464

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_8
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDuration()I

    move-result p2

    mul-int/lit16 p2, p2, 0x3e8

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f14133f

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$9$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIXi1iiXI(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$6(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$1$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$4$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$7$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->itemValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$8$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiX011(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$10(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiiiO(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$8$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->onInitBaseLayoutAfter$lambda$0$0$0$9(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final itemDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a055c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final itemValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a055d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final mSportCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    return-object v0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/p55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/p55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 6

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/q55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/q55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    const v1, 0x7f0d0f1d

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/t55;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/t55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/android/mltcode/paycertificationapi/u55;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/u55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_1
    :goto_0
    sget-object v2, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/v55;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/v55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Lcom/android/mltcode/paycertificationapi/w55;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/w55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_3
    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1

    :cond_4
    new-instance v3, Lcom/android/mltcode/paycertificationapi/x55;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/x55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :goto_1
    new-instance v3, Lcom/android/mltcode/paycertificationapi/y55;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/y55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XO11O()Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v3, Lcom/android/mltcode/paycertificationapi/z55;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/z55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_5
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/q62;->O1XXXX(I)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Lcom/android/mltcode/paycertificationapi/a65;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/a65;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/b65;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/b65;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_6
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v2, v5, v3, v4}, Lcom/android/mltcode/paycertificationapi/q62;->Oi0(Lcom/android/mltcode/paycertificationapi/q62;IZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lcom/android/mltcode/paycertificationapi/s55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/s55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_7
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->TIME:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/b55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f0813a6

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f0813a4

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/c55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->TIME:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f14133f

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$1(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/h65;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/h65;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f081288

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f081285

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/i65;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i65;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$1$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$1$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f140464

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$10(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->ALTITUDE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f081230

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f08122e

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/e55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$10$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->ALTITUDE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$10$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f140120

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$2(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/x45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/x45;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f081288

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f081285

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/y45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/y45;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$2$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$2$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f140464

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$3(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->SPEED:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/r55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/r55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f081369

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f081367

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/c65;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c65;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$3$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->SPEED:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$3$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f141287

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$4(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->PACE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/l55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/l55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f0812fe

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f0812fd

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/m55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/m55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$4$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->PACE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$4$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f14108b

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$5(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->PACE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/f55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/f55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f0812fe

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f0812fd

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/h55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/h55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$5$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->PACE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$5$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f14108b

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$6(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->CALORIES:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/n55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/n55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f081255

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f081252

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/o55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/o55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$6$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->CALORIES:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$6$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f140274

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$7(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->HEARTRATE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/j55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/j55;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f0812f6

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f0812b3

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/k55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/k55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$7$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->HEARTRATE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$7$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f140cb6

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$8(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->STEP:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/z45;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f081390

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f08138c

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/a55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$8$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->STEP:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$8$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f1412c6

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$9(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_0

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->SPM:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/v45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/v45;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    const p0, 0x7f08136c

    goto :goto_1

    :cond_2
    :goto_0
    const p0, 0x7f08136b

    :goto_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/g55;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/g55;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$9$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/sport/SportDataType;->SPM:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$9$1(ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    const p3, 0x7f14128d

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const p2, 0x7f0a05fc

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showData(Lcom/sma/smartv3/ui/sport/SportDataType;)V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    const/4 v1, 0x0

    const-string v2, "sportDataOrder"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v6

    if-ne v3, v6, :cond_1

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v3, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_2
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->type:Lcom/sma/smartv3/ui/sport/SportDataType;

    if-nez p1, :cond_5

    const-string p1, "type"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_5
    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showItemValue(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v3, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5f

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v0, Lcom/android/mltcode/paycertificationapi/js4;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez p1, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    move-object v1, p1

    :goto_1
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/w45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/w45;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final showItemValue(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->getOneContent(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)Lkotlin/Pair;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XO11O()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->HEARTRATE:Lcom/sma/smartv3/ui/sport/SportDataType;

    if-ne p1, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->getItemValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    const-string p2, "--"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->getItemDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->getItemValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->getItemDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final getItemDesc()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->itemDesc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getItemValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->itemValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d011a

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->getMSportCallback()Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->XOO0XOOii(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;)V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 7

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/js4;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/js4;-><init>(Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v1, Lcom/android/mltcode/paycertificationapi/js4;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    check-cast v2, Lcom/android/mltcode/paycertificationapi/js4;

    iput-object v2, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/j65;->OXO1(Lcom/android/mltcode/paycertificationapi/js4;)Lcom/android/mltcode/paycertificationapi/js4;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->sportDataOrder:Lcom/android/mltcode/paycertificationapi/js4;

    if-nez v0, :cond_1

    const-string v0, "sportDataOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/js4;->XO0O10()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v3

    if-ne v1, v3, :cond_2

    iput-object v2, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->type:Lcom/sma/smartv3/ui/sport/SportDataType;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->type:Lcom/sma/smartv3/ui/sport/SportDataType;

    if-nez v0, :cond_4

    const-string v0, "type"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v4, v0

    :goto_2
    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v1

    invoke-direct {p0, v4, v1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->showItemValue(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->getMSportCallback()Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->XiOIii1(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d65;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d65;-><init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

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

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
