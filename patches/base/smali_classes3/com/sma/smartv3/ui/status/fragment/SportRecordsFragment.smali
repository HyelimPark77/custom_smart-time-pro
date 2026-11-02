.class public final Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportRecordsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n19#2:166\n15#2:167\n99#3,7:168\n106#3,3:176\n79#3,7:179\n109#3:186\n99#3,7:187\n106#3,3:195\n79#3,7:198\n109#3:205\n99#3,7:206\n106#3,3:214\n79#3,7:217\n109#3:224\n99#3,7:225\n106#3,3:233\n79#3,7:236\n109#3:243\n99#3,7:244\n106#3,3:252\n79#3,7:255\n109#3:262\n99#3,7:263\n106#3,3:271\n79#3,7:274\n109#3:281\n1#4:175\n1#4:194\n1#4:213\n1#4:232\n1#4:251\n1#4:270\n*S KotlinDebug\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n*L\n24#1:166\n24#1:167\n137#1:168,7\n137#1:176,3\n137#1:179,7\n137#1:186\n139#1:187,7\n139#1:195,3\n139#1:198,7\n139#1:205\n143#1:206,7\n143#1:214,3\n143#1:217,7\n143#1:224\n146#1:225,7\n146#1:233,3\n146#1:236,7\n146#1:243\n148#1:244,7\n148#1:252,3\n148#1:255,7\n148#1:262\n153#1:263,7\n153#1:271,3\n153#1:274,7\n153#1:281\n137#1:175\n139#1:194\n143#1:213\n146#1:232\n148#1:251\n153#1:270\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportRecordsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n19#2:166\n15#2:167\n99#3,7:168\n106#3,3:176\n79#3,7:179\n109#3:186\n99#3,7:187\n106#3,3:195\n79#3,7:198\n109#3:205\n99#3,7:206\n106#3,3:214\n79#3,7:217\n109#3:224\n99#3,7:225\n106#3,3:233\n79#3,7:236\n109#3:243\n99#3,7:244\n106#3,3:252\n79#3,7:255\n109#3:262\n99#3,7:263\n106#3,3:271\n79#3,7:274\n109#3:281\n1#4:175\n1#4:194\n1#4:213\n1#4:232\n1#4:251\n1#4:270\n*S KotlinDebug\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n*L\n24#1:166\n24#1:167\n137#1:168,7\n137#1:176,3\n137#1:179,7\n137#1:186\n139#1:187,7\n139#1:195,3\n139#1:198,7\n139#1:205\n143#1:206,7\n143#1:214,3\n143#1:217,7\n143#1:224\n146#1:225,7\n146#1:233,3\n146#1:236,7\n146#1:243\n148#1:244,7\n148#1:252,3\n148#1:255,7\n148#1:262\n153#1:263,7\n153#1:271,3\n153#1:274,7\n153#1:281\n137#1:175\n139#1:194\n143#1:213\n146#1:232\n148#1:251\n153#1:270\n*E\n"
    }
.end annotation


# instance fields
.field private page:I

.field private final pageNumber:I

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    const/16 v1, 0x1e

    iput v1, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->pageNumber:I

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData$lambda$0$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->onInitBaseLayoutAfter$lambda$0$1(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData$lambda$0$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->onInitBaseLayoutAfter$lambda$0$1$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData$lambda$0$0$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->onInitBaseLayoutAfter$lambda$0$1$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData$lambda$0$0$2$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData$lambda$0$1(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/angcyo/dsladapter/DslAdapter;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const-string v0, "iterator(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "next(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-static {v1, v2, v0}, Lcom/sma/smartv3/model/SportRecordDataKt;->parseSportRecordItemCommonData(Landroid/content/Context;Lcom/sma/smartv3/model/AppUser;Lcom/sma/smartv3/model/SportRecordData;)Lcom/sma/smartv3/model/SportRecordItemCommonData;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/k35;

    invoke-direct {v2, v0, v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/k35;-><init>(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V

    const v0, 0x7f0d107a

    invoke-static {p1, v0, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final findData$lambda$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p4, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/n35;

    invoke-direct {v0, p0, p1, p4, p2}, Lcom/android/mltcode/paycertificationapi/n35;-><init>(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;)V

    invoke-virtual {p4, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/o35;

    invoke-direct {p1, p0, p3, p4}, Lcom/android/mltcode/paycertificationapi/o35;-><init>(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p4, p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p5, "itemHolder"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "<unused var>"

    invoke-static {p6, p5}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p7, p5}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p5, 0x7f0a0adc

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p5

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result p6

    const/4 p7, 0x2

    if-ne p6, p7, :cond_0

    const p6, 0x7f081301

    goto :goto_0

    :cond_0
    const p6, 0x7f0813cd

    :goto_0
    invoke-virtual {p5, p6}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    const p5, 0x7f0a0ae5

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutImg()I

    move-result p6

    invoke-virtual {p5, p6}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_2
    const p5, 0x7f0a0422

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p5

    if-eqz p5, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getGpsState()I

    move-result p6

    invoke-virtual {p5, p6}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_3
    const p5, 0x7f0a0a9a

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p5, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutModeName()I

    move-result p6

    invoke-virtual {p5, p6}, Landroid/widget/TextView;->setText(I)V

    :cond_4
    const p5, 0x7f0a0ade

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p5, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getSportStartTime()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    new-instance p5, Lcom/android/mltcode/paycertificationapi/s35;

    invoke-direct {p5, p0, p2, p4, p3}, Lcom/android/mltcode/paycertificationapi/s35;-><init>(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;)V

    const p0, 0x7f0a019b

    invoke-virtual {p4, p0, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const p0, 0x7f0a09c1

    invoke-virtual {p4, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->rv(I)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getSpanCount()I

    move-result p5

    invoke-direct {p2, p3, p5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance p2, Lcom/sma/smartv3/model/SportRecordItemAdapter;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getContentList()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    const-string p5, "getContext(...)"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1, p3}, Lcom/sma/smartv3/model/SportRecordItemAdapter;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/t35;

    invoke-direct {p1, p4}, Lcom/android/mltcode/paycertificationapi/t35;-><init>(Lcom/angcyo/dsladapter/DslViewHolder;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_6
    const p0, 0x7f0a06fe

    invoke-virtual {p4, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance p1, Lcom/android/mltcode/paycertificationapi/u35;

    invoke-direct {p1, p4}, Lcom/android/mltcode/paycertificationapi/u35;-><init>(Lcom/angcyo/dsladapter/DslViewHolder;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_7
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
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

    const/4 p4, 0x0

    if-eqz p0, :cond_1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2, p4}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;ZILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapter;->getDataItems()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p3, v0, p4, p2, p4}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0, p4, v0, p4}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private static final findData$lambda$0$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final findData$lambda$0$0$2$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final findData$lambda$0$1(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result p3

    const-class v0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;

    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    const-class v2, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;

    const/4 v3, 0x1

    const-string v4, "mArg1"

    const-string v5, "mArg3"

    const-string v6, "mArg2"

    const-string v7, "mArg0"

    const/4 v8, 0x0

    if-eq p3, v3, :cond_2

    const/4 v9, 0x2

    if-eq p3, v9, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v6, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v5, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_0
    sget-object p3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v4, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v6, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v5, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v4, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v6, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v5, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    sget-object p3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v4, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v6, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v5, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/i72;->XII01OO1I()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v4, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v6, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v5, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_4
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v6, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v5, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    :goto_0
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0, v8, v3, v8}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu$default(Lcom/angcyo/dsladapter/SwipeMenuHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V

    :cond_5
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData$lambda$0(Lcom/sma/smartv3/model/SportRecordData;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslAdapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/BaseDslStateItem;->getItemStateLayoutMap()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f0d0f5c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l35;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/l35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslLoadMoreItem()Lcom/angcyo/dsladapter/DslLoadMoreItem;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/m35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/m35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslLoadMoreItem;->setOnLoadMore(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/q35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/q35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 5

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->page:I

    iget v3, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->pageNumber:I

    invoke-static {v0, v3}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(II)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    invoke-static {p0, v4, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v4}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMoreEnable(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$1(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/r35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/r35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$1$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/v35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/v35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$1$0$0(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 14

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->page:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->page:I

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->pageNumber:I

    mul-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(II)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMore$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Object;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    invoke-direct {p0, v2, v0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/ArrayList;)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v2

    invoke-static/range {v8 .. v13}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMore$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Object;ZILjava/lang/Object;)V

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

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->setAdapterStatus(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getAdapterStatus()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

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

    const v0, 0x7f0d0e7d

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/p35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/p35;-><init>(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lcom/angcyo/dsladapter/SwipeMenuHelper;->Companion:Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;->recyclerViewId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;->OXO1(Landroidx/recyclerview/widget/RecyclerView;)Lcom/angcyo/dsladapter/SwipeMenuHelper;

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
