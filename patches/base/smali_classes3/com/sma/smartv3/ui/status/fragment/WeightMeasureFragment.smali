.class public final Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeightMeasureFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n19#2:620\n15#2:621\n11#2,2:634\n774#3:622\n865#3,2:623\n78#4,3:625\n81#4,5:629\n1#5:628\n*S KotlinDebug\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n*L\n64#1:620\n64#1:621\n592#1:634,2\n572#1:622\n572#1:623,2\n133#1:625,3\n133#1:629,5\n133#1:628\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeightMeasureFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n19#2:620\n15#2:621\n11#2,2:634\n774#3:622\n865#3,2:623\n78#4,3:625\n81#4,5:629\n1#5:628\n*S KotlinDebug\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n*L\n64#1:620\n64#1:621\n592#1:634,2\n572#1:622\n572#1:623,2\n133#1:625,3\n133#1:629,5\n133#1:628\n*E\n"
    }
.end annotation


# instance fields
.field private final btnInputWeight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMeasureWeight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WeightMeasureItemData;",
            ">;"
        }
    .end annotation
.end field

.field private final llItemPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llNoDatePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llReportPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llTitlePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mItemView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSbvBmi$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSetWeightPopup$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWeight:Lcom/sma/smartv3/db/entity/Weight;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

.field private final scrollView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvBfrValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvMeasureDate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTopBfrValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTopBmiValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTopWeightUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTopWeightValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvWeightUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvWeightValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/gz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->table$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/hz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->scrollView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llNoDatePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/jz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llReportPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/kz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llTitlePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/lz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llItemPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/mz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopBmiValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/nz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopWeightValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/oz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopWeightUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/pz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopBfrValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/rz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/rz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvMeasureDate$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/uz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->btnMeasureWeight$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/vz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->btnInputWeight$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/wz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvWeightValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/xz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvWeightUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/yz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvBfrValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/zz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mSbvBmi$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/a07;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/a07;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mItemView$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b07;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/b07;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mSetWeightPopup$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llNoDatePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvBfrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvWeightUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopWeightUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvWeightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llReportPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopWeightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;F)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mSetWeightPopup_delegate$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;F)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llTitlePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/android/mltcode/paycertificationapi/j07;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mSetWeightPopup_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/android/mltcode/paycertificationapi/j07;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mSbvBmi_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->btnMeasureWeight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->btnInputWeight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvMeasureDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llItemPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->scrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mItemView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$showItems(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Lcom/sma/smartv3/model/LevelType;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->showItems(Lcom/sma/smartv3/model/LevelType;)V

    return-void
.end method

.method private static final btnInputWeight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final btnMeasureWeight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getBtnInputWeight()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->btnInputWeight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getBtnMeasureWeight()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->btnMeasureWeight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getItems(Lcom/sma/smartv3/db/entity/Weight;)V
    .locals 56

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    new-instance v2, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v3, 0x7f141500

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v3, "getString(...)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v5

    float-to-double v5, v5

    iget-object v7, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v7

    invoke-static {v5, v6, v7}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v6

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightRange()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v9, 0x7f030032

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v13

    const-string v5, "getStringArray(...)"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f030029

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v14

    const-string v10, "getIntArray(...)"

    invoke-static {v14, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v15, 0x7f140d4b

    invoke-virtual {v0, v15}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v22, 0xd880

    const/16 v23, 0x0

    move-object/from16 v16, v3

    const v3, 0x7f081332

    move-object/from16 v17, v5

    const/4 v5, 0x1

    move/from16 v18, v9

    const/4 v9, 0x1

    move-object/from16 v19, v10

    const/4 v10, 0x3

    move/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v24, v16

    const/16 v16, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x1

    move/from16 v26, v18

    const/16 v18, 0x0

    move-object/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x1

    move-object/from16 v29, v24

    move-object/from16 v31, v25

    move-object/from16 v33, v27

    invoke-direct/range {v2 .. v23}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    const-string v3, "items"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140226

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v5, v29

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMBmi()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMBmiRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v10, 0x7f03002e

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    move-object/from16 v7, v31

    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f030027

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v10

    move-object/from16 v11, v33

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d3b

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd890

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081322

    const/4 v7, 0x1

    move-object/from16 v29, v16

    move-object/from16 v16, v10

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v27, v3

    move-object/from16 v2, v29

    move-object/from16 v3, v31

    move-object/from16 v34, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_1

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_1
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f1401c9

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfFat()D

    move-result-wide v8

    const v5, 0x7f1410b6

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfFatRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f030032

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f030029

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v7

    move-object/from16 v11, v34

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d3a

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move v13, v5

    const v5, 0x7f081321

    move-object/from16 v16, v7

    const/4 v7, 0x1

    move-object/from16 v33, v11

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x3

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x1

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x1

    move-object/from16 v35, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_2

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_2
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140fbd

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfMuscle()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfMuscleRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f03002c

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v11, 0x7f030025

    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v12, v35

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v13, 0x7f140d43

    invoke-virtual {v0, v13}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f08132b

    move/from16 v17, v7

    const/4 v7, 0x1

    move/from16 v18, v11

    const/4 v11, 0x1

    move-object/from16 v33, v12

    const/4 v12, 0x2

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x1

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x1

    move-object/from16 v37, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_3

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_3
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140e13

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMLevelOfVisceralFat()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMLevelOfVisceralFatRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f03002d

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030026

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v7, v37

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v10, 0x7f140d42

    invoke-virtual {v0, v10}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd890

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f08132a

    move-object/from16 v33, v7

    const/4 v7, 0x1

    move-object/from16 v23, v10

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v40, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_4

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_4
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f1414cf

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfWater()D

    move-result-wide v8

    const v5, 0x7f1410b6

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfWaterRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f03002c

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v12, 0x7f030025

    invoke-virtual {v7, v12}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v7

    move-object/from16 v13, v40

    invoke-static {v7, v13}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x7f140d4a

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move-object/from16 v23, v5

    const v5, 0x7f081331

    move-object/from16 v16, v7

    const/4 v7, 0x1

    move/from16 v19, v11

    const/4 v11, 0x1

    move/from16 v18, v12

    const/4 v12, 0x2

    move-object/from16 v33, v13

    const/4 v13, 0x0

    const v20, 0x7f1410b6

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x1

    move/from16 v36, v20

    const/16 v20, 0x0

    move/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x1

    move-object/from16 v31, v3

    move-object/from16 v41, v33

    move/from16 v3, v38

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_5
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f141504

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfBone()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfBoneRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    move-object/from16 v5, v31

    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f030025

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v7

    move-object/from16 v12, v41

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v13, 0x7f140d4c

    invoke-virtual {v0, v13}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    const v5, 0x7f081333

    move-object/from16 v16, v7

    const/4 v7, 0x1

    move/from16 v18, v11

    const/4 v11, 0x1

    move-object/from16 v33, v12

    const/4 v12, 0x2

    move-object/from16 v23, v13

    const/4 v13, 0x0

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x1

    move-object/from16 v3, v31

    move-object/from16 v44, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_6
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140228

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMBmr()D

    move-result-wide v8

    const v5, 0x7f140d64

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMBmrRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f03002b

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030024

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v7, v44

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v11, 0x7f140d3c

    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081323

    move-object/from16 v33, v7

    const/4 v7, 0x1

    move-object/from16 v23, v11

    const/4 v11, 0x1

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v46, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_7

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_7
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140bc9

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfFat()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfFatRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030031

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030028

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v7, v46

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v11, 0x7f140d3e

    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081326

    move-object/from16 v33, v7

    const/4 v7, 0x1

    move-object/from16 v23, v11

    const/4 v11, 0x1

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v47, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_8

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_8
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f141506

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfSkeletalMuscle()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfSkeletalMuscleRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v11, 0x7f03002c

    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030025

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v11, v47

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d4e

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081335

    move/from16 v18, v7

    const/4 v7, 0x1

    move-object/from16 v33, v11

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x1

    move-object/from16 v48, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_9

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_9
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f14115b

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSkeletalMuscle()D

    move-result-wide v8

    const v5, 0x7f1410b6

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSkeletalMuscleRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f03002c

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f030025

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v7

    move-object/from16 v12, v48

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v13, 0x7f140d47

    invoke-virtual {v0, v13}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move/from16 v17, v5

    const v5, 0x7f08132f

    move-object/from16 v16, v7

    const/4 v7, 0x1

    move/from16 v18, v11

    const/4 v11, 0x1

    move-object/from16 v33, v12

    const/4 v12, 0x2

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    const/16 v19, 0x1

    move/from16 v36, v20

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x1

    move-object/from16 v50, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_a

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_a
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f141507

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfWater()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfWaterRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v11, 0x7f03002c

    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030025

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v11, v50

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d4f

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081336

    move/from16 v18, v7

    const/4 v7, 0x1

    move-object/from16 v33, v11

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x1

    move-object/from16 v51, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_b

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_b
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f141505

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfProtein()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfProteinRange()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v11, 0x7f03002c

    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030025

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v11, v51

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d4d

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xd880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081334

    move/from16 v39, v7

    const/4 v7, 0x1

    move-object/from16 v33, v11

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v52, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_c

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_c
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140d04

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMIdealWeight()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0x3efe0

    const/16 v25, 0x0

    const v5, 0x7f081329

    const/4 v7, 0x1

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

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_d

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_d
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f141508

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightToControl()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v29, 0x0

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v11, 0x7f03002c

    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030025

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v11, v52

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d50

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xf880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081337

    move/from16 v39, v7

    const/4 v7, 0x1

    move-object/from16 v33, v11

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v53, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_e

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_e
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140bcb

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMFatToControl()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v11, 0x7f03002c

    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030025

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v11, v53

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d40

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xf880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f081328

    move/from16 v39, v7

    const/4 v7, 0x1

    move-object/from16 v33, v11

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v54, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_f

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_f
    new-instance v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v5, 0x7f140fbe

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMMuscleToControl()D

    move-result-wide v7

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v11, 0x7f03002c

    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f030025

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    move-object/from16 v11, v54

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140d44

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v24, 0xf880

    const/16 v25, 0x0

    move-object/from16 v16, v5

    const v5, 0x7f08132c

    move/from16 v39, v7

    const/4 v7, 0x1

    move-object/from16 v33, v11

    const/4 v11, 0x1

    move-object/from16 v23, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v55, v33

    invoke-direct/range {v4 .. v25}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_10

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_10
    const v4, 0x7f140238

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMBodyShape()D

    move-result-wide v33

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f030011

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f030010

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v6

    move-object/from16 v11, v55

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v29, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v49, 0x33d94

    const/16 v50, 0x0

    const v30, 0x7f081325

    const/16 v32, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x1

    const/16 v37, 0x5

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x1

    const/16 v47, 0x0

    const/16 v48, 0x0

    move-object/from16 v31, v4

    move-object/from16 v40, v5

    move-object/from16 v46, v6

    invoke-direct/range {v29 .. v50}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v29

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_11

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_11
    new-instance v29, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v4, 0x7f14104e

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMStateOfNutrition()D

    move-result-wide v33

    const-wide/high16 v5, 0x4010000000000000L    # 4.0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v39

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f03002c

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f030025

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v6

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v8, 0x7f140d45

    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v49, 0xf890

    const/16 v50, 0x0

    const v30, 0x7f08132d

    const/16 v32, 0x1

    const/16 v35, 0x0

    const/16 v36, 0x1

    const/16 v37, 0x2

    const/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x1

    move-object/from16 v31, v4

    move-object/from16 v40, v5

    move-object/from16 v41, v6

    move-object/from16 v48, v8

    invoke-direct/range {v29 .. v50}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v29

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_12

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_12
    new-instance v29, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v4, 0x7f140229

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMAgeOfBody()D

    move-result-wide v33

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMAgeOfBodyRange()Ljava/util/List;

    move-result-object v39

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f030033

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f03002a

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v6

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v8, 0x7f140d3d

    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v49, 0xd890

    const/16 v50, 0x0

    const v30, 0x7f081324

    const/16 v32, 0x1

    const/16 v35, 0x0

    const/16 v36, 0x1

    const/16 v37, 0x1

    const/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x1

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x1

    move-object/from16 v31, v4

    move-object/from16 v40, v5

    move-object/from16 v41, v6

    move-object/from16 v48, v8

    invoke-direct/range {v29 .. v50}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v29

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_13

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_13
    new-instance v29, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v4, 0x7f141132

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfProtein()D

    move-result-wide v33

    const v5, 0x7f1410b6

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfProteinRange()Ljava/util/List;

    move-result-object v39

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f03002c

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v9

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v10, 0x7f140d46

    invoke-virtual {v0, v10}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v49, 0xd880

    const/16 v50, 0x0

    const v30, 0x7f08132e

    const/16 v32, 0x1

    const/16 v36, 0x1

    const/16 v37, 0x2

    const/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x1

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x1

    move-object/from16 v31, v4

    move-object/from16 v35, v6

    move-object/from16 v40, v8

    move-object/from16 v41, v9

    move-object/from16 v48, v10

    invoke-direct/range {v29 .. v50}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v29

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_14

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_14
    new-instance v29, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v4, 0x7f14115c

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSubcutaneousFat()D

    move-result-wide v33

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSubcutaneousFatRange()Ljava/util/List;

    move-result-object v39

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v9, 0x7f03002c

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v3

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v7, 0x7f140d48

    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v49, 0xd880

    const/16 v50, 0x0

    const v30, 0x7f081330

    const/16 v32, 0x1

    const/16 v36, 0x1

    const/16 v37, 0x2

    const/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x1

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x1

    move-object/from16 v41, v3

    move-object/from16 v31, v4

    move-object/from16 v35, v5

    move-object/from16 v40, v6

    move-object/from16 v48, v7

    invoke-direct/range {v29 .. v50}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v29

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_15

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_15
    new-instance v3, Lcom/sma/smartv3/model/WeightMeasureItemData;

    const v4, 0x7f140bca

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Weight;->getMFatFreeBodyWeight()D

    move-result-wide v6

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    invoke-static {v6, v7, v4}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getWeightValue(DI)D

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide v7

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f140d3f

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0xffe0

    const/16 v24, 0x0

    move-object/from16 v22, v4

    const v4, 0x7f081327

    const/4 v6, 0x1

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

    const/16 v21, 0x1

    invoke-direct/range {v3 .. v24}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final getLlItemPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llItemPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getLlNoDatePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llNoDatePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getLlReportPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llReportPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getLlTitlePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->llTitlePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMItemView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mItemView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMSbvBmi()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mSbvBmi$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    return-object v0
.end method

.method private final getMSetWeightPopup()Lcom/android/mltcode/paycertificationapi/j07;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mSetWeightPopup$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/j07;

    return-object v0
.end method

.method private final getScrollView()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->scrollView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method private final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method private final getTvBfrValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvBfrValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getTvMeasureDate()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvMeasureDate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvTopBfrValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopBfrValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getTvTopBmiValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopBmiValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getTvTopWeightUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopWeightUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvTopWeightValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopWeightValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getTvWeightUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvWeightUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvWeightValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvWeightValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopBmiValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->tvTopBfrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getMSetWeightPopup()Lcom/android/mltcode/paycertificationapi/j07;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getBtnInputWeight()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-btnInputWeight>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getMSetWeightPopup()Lcom/android/mltcode/paycertificationapi/j07;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/high16 p0, 0x42820000    # 65.0f

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result p0

    :goto_0
    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/j07;->IXXOO(F)V

    return-void
.end method

.method private static final llItemPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0734

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final llNoDatePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0735

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final llReportPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0736

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final llTitlePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0737

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mItemView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0995

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mSbvBmi_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09e0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    return-object p0
.end method

.method private static final mSetWeightPopup_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/android/mltcode/paycertificationapi/j07;
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/j07;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;-><init>(Landroid/app/Activity;)V

    const v1, 0x7f141187

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->i010I(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->iX(I)V

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->IXXOO(F)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qz6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->II1Xi0(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method private static final mSetWeightPopup_delegate$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;F)Z
    .locals 88

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/high16 v2, 0x41a00000    # 20.0f

    cmpg-float v2, v1, v2

    if-gez v2, :cond_0

    const v0, 0x7f141502

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    goto/16 :goto_0

    :cond_0
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/model/AppUser;->setWeight(F)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/sma/smartv3/db/entity/Weight;

    const v86, 0x1fffff

    const/16 v87, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const-wide/16 v48, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const-wide/16 v55, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const-wide/16 v62, 0x0

    const-wide/16 v64, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const-wide/16 v69, 0x0

    const/16 v71, 0x0

    const-wide/16 v72, 0x0

    const/16 v74, 0x0

    const-wide/16 v75, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const-wide/16 v79, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, -0x1

    invoke-direct/range {v5 .. v87}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v5, v2, v3}, Lcom/sma/smartv3/db/entity/Weight;->setMTime(J)V

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Weight;->getMTime()J

    move-result-wide v2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "millis2String(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lcom/sma/smartv3/db/entity/Weight;->setMLocalTime(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Lcom/sma/smartv3/db/entity/Weight;->setMWeight(F)V

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lcom/sma/smartv3/db/entity/Weight;->setMIsMeasure(I)V

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v2

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->I0IIOi(FF)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-virtual {v5, v1, v2}, Lcom/sma/smartv3/db/entity/Weight;->setMBmi(D)V

    iget-object v0, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const-string v0, "mWeightDao"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    filled-new-array {v5}, [Lcom/sma/smartv3/db/entity/Weight;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/sma/smartv3/db/dao/WeightDao;->insert(Ljava/util/List;)[J

    const-string v0, "weight_change"

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v0, "measure_weight_change"

    invoke-static {v0, v5}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private static final scrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09e9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method private final showItems(Lcom/sma/smartv3/model/LevelType;)V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getMItemView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->items:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, "items"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/model/WeightMeasureItemData;

    sget-object v5, Lcom/sma/smartv3/model/LevelType;->ALL:Lcom/sma/smartv3/model/LevelType;

    if-ne p1, v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevelType()Lcom/sma/smartv3/model/LevelType;

    move-result-object v4

    if-ne v4, p1, :cond_1

    :goto_1
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    const-string v1, "requireActivity(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;

    invoke-direct {v1, v2, p1}, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method private static final tvBfrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c40

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final tvMeasureDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0cba

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvTopBfrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a189d

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final tvTopBmiValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a189e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final tvTopWeightUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a189f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvTopWeightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18a0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final tvWeightUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18c8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvWeightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18c9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/db/entity/Weight;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    :cond_0
    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 21
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getMItemView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getMItemView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f060792

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type android.widget.LinearLayout"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setShowDividers(I)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f081422

    invoke-static {v5, v6}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x7f060789

    invoke-static {v6, v7}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v1

    new-instance v5, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment$OXO1;

    invoke-direct {v5, v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-virtual {v1, v5}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->weightDao()Lcom/sma/smartv3/db/dao/WeightDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvTopWeightUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v1

    const/16 v5, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v1

    const v6, 0x7f0a0738

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getBtnMeasureWeight()Landroid/view/View;

    move-result-object v1

    new-instance v6, Lcom/android/mltcode/paycertificationapi/sz6;

    invoke-direct {v6, v0}, Lcom/android/mltcode/paycertificationapi/sz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getBtnInputWeight()Landroid/view/View;

    move-result-object v1

    new-instance v6, Lcom/android/mltcode/paycertificationapi/tz6;

    invoke-direct {v6, v0}, Lcom/android/mltcode/paycertificationapi/tz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    if-nez v1, :cond_1

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlNoDatePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlReportPanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlTitlePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlNoDatePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlReportPanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v1

    if-ne v1, v2, :cond_2

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlTitlePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_2
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlTitlePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMBmi()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v6

    :goto_1
    const-wide/16 v7, 0x0

    invoke-static {v1, v7, v8}, Lkotlin/jvm/internal/Intrinsics;->iO(Ljava/lang/Double;D)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v1

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v9

    invoke-static {v1, v9}, Lcom/android/mltcode/paycertificationapi/cp5;->I0IIOi(FF)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_2

    :cond_4
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMBmi()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, v6

    :goto_2
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvTopBmiValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    double-to-float v10, v10

    invoke-static {v10, v3, v4, v6}, Lcom/android/mltcode/paycertificationapi/cp5;->X11iII1O1(FZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvTopWeightValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v4

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v9

    iget-object v10, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v10

    invoke-static {v9, v10}, Lcom/android/mltcode/paycertificationapi/cp5;->IXXOO(FI)F

    move-result v9

    invoke-static {v9}, Lcom/android/mltcode/paycertificationapi/cp5;->OIX0iXi(F)F

    move-result v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvTopBfrValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v4

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfFat()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    goto :goto_3

    :cond_6
    move-object v9, v6

    :goto_3
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvMeasureDate()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Weight;->getMLocalTime()Ljava/lang/String;

    move-result-object v9

    goto :goto_4

    :cond_7
    move-object v9, v6

    :goto_4
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvWeightValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v4

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v9

    iget-object v10, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v10

    invoke-static {v9, v10}, Lcom/android/mltcode/paycertificationapi/cp5;->IXXOO(FI)F

    move-result v9

    invoke-static {v9}, Lcom/android/mltcode/paycertificationapi/cp5;->OIX0iXi(F)F

    move-result v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvWeightUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v9

    invoke-static {v9}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvBfrValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v4

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    if-eqz v9, :cond_8

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfFat()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    :cond_8
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    const-string v6, "getIntArray(...)"

    const v9, 0x7f030027

    const-string v10, "getStringArray(...)"

    const-string v11, "<get-mSbvBmi>(...)"

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Weight;->getMIsMeasure()I

    move-result v4

    if-ne v4, v2, :cond_9

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlItemPanel()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getMSbvBmi()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v12

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMBmiRange()Ljava/util/List;

    move-result-object v15

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f03002e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v2

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v19, 0x20

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    invoke-static/range {v12 .. v20}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setBarView$default(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZILjava/lang/Object;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getItems(Lcom/sma/smartv3/db/entity/Weight;)V

    sget-object v1, Lcom/sma/smartv3/model/LevelType;->ALL:Lcom/sma/smartv3/model/LevelType;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->showItems(Lcom/sma/smartv3/model/LevelType;)V

    return-void

    :cond_9
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getLlItemPanel()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvTopBfrValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    const v3, 0x7f1403bc

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getTvBfrValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getMSbvBmi()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v12

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-wide v2, 0x4032666666666666L    # 18.4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const-wide v3, 0x4038e66666666666L    # 24.9

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-wide v4, 0x403de66666666666L    # 29.9

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const-wide v7, 0x4041733333333333L    # 34.9

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f03002f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v2

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v19, 0x20

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    invoke-static/range {v12 .. v20}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setBarView$default(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZILjava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0ea8

    return v0
.end method

.method public final onMeasureWeightChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "measure_weight_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onMeasureWeightChanged"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    check-cast p1, Lcom/sma/smartv3/db/entity/Weight;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->mWeight:Lcom/sma/smartv3/db/entity/Weight;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->initView()V

    return-void
.end method

.method public final share()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->getScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v1

    const-string v2, "<get-scrollView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->iO(Landroidx/core/widget/NestedScrollView;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XO0O10(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    return-void
.end method
