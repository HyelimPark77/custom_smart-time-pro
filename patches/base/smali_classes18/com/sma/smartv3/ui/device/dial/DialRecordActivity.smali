.class public final Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialRecordActivity.kt\ncom/sma/smartv3/ui/device/dial/DialRecordActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1#2:224\n774#3:225\n865#3,2:226\n774#3:228\n865#3,2:229\n1869#3,2:231\n*S KotlinDebug\n*F\n+ 1 DialRecordActivity.kt\ncom/sma/smartv3/ui/device/dial/DialRecordActivity\n*L\n154#1:225\n154#1:226,2\n156#1:228\n156#1:229,2\n160#1:231,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialRecordActivity.kt\ncom/sma/smartv3/ui/device/dial/DialRecordActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1#2:224\n774#3:225\n865#3,2:226\n774#3:228\n865#3,2:229\n1869#3,2:231\n*S KotlinDebug\n*F\n+ 1 DialRecordActivity.kt\ncom/sma/smartv3/ui/device/dial/DialRecordActivity\n*L\n154#1:225\n154#1:226,2\n156#1:228\n156#1:229,2\n160#1:231,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mChange:Z

.field private mCurInfoImage:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;

.field private mCurSendBytes:[B

.field private mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mRecyclerSpanCount:I

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSyncDialPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I01O0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I01O0O;-><init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO11XIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO11XIO;-><init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    const/4 v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mRecyclerSpanCount:I

    new-instance v0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->viewHolder$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->syncDialPopup$lambda$0$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->syncDialPopup$lambda$0$1(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Z

    move-result p0

    return p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static final synthetic access$getMProgressPop$p(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Lcom/android/mltcode/paycertificationapi/c72;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-object p0
.end method

.method public static final synthetic access$setMProgressPop$p(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;Lcom/android/mltcode/paycertificationapi/c72;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-void
.end method

.method public static final synthetic access$syncDial(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->syncDial()V

    return-void
.end method

.method public static final synthetic access$syncFailed(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->syncFailed(I)V

    return-void
.end method

.method public static final synthetic access$viewHolder(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;Landroid/content/Context;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->viewHolder(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;Landroid/content/Context;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p0

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final initList(Ljava/lang/String;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const-string v3, ".png"

    const-string v4, ".bin"

    if-eqz v1, :cond_2

    move-object v5, v4

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    const-string v6, ""

    if-eqz v1, :cond_3

    move-object v3, v6

    :cond_3
    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v6

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v7

    const-string v8, "listFilesInDir(...)"

    const/4 v9, 0x0

    const/4 v10, 0x2

    const-string v11, "getName(...)"

    if-nez v7, :cond_6

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ljava/io/File;

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14, v5, v2, v10, v9}, Lcom/android/mltcode/paycertificationapi/oe5;->O0Ii(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v14, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v14}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "_"

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14, v2, v10, v9}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_7
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ljava/io/File;

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v5, v2, v10, v9}, Lcom/android/mltcode/paycertificationapi/oe5;->O0Ii(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/io/File;

    if-eqz v1, :cond_9

    sget-object v8, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2String(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "readFile2String(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_7

    :cond_9
    move-object v8, v6

    :goto_7
    new-instance v9, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;

    sget-object v10, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v9, v11, v7, v8}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    return-object v2
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0996

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final notifyData()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    iget v2, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mRecyclerSpanCount:I

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const v0, 0x7f0d0ede

    goto :goto_0

    :cond_0
    const v0, 0x7f0d0eda

    :goto_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->initList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$notifyData$mRecyclerAdapter$1;

    invoke-direct {v2, p0, v0, v1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$notifyData$mRecyclerAdapter$1;-><init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;ILjava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private final syncDial()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/android/mltcode/paycertificationapi/c72;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140439

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->I1(I)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    const v1, 0x7f14043a

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->I1(I)V

    :cond_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->WATCH_FACE:Lcom/szabh/smable3/BleKey;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mCurSendBytes:[B

    if-nez v2, :cond_1

    const-string v2, "mCurSendBytes"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    invoke-virtual {v0, v1, v4, v3}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    :cond_2
    return-void
.end method

.method private static final syncDialPopup$lambda$0$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Z
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mCurInfoImage:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;

    const/4 v1, 0x0

    const-string v2, "mCurInfoImage"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;->XOO0ii0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mCurInfoImage:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mChange:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->notifyData()V

    return v0
.end method

.method private static final syncDialPopup$lambda$0$1(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->syncDial()V

    const/4 p0, 0x1

    return p0
.end method

.method private final syncFailed(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/OOX00;->iO(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic syncFailed$default(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->syncFailed(I)V

    return-void
.end method

.method private final viewHolder(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;Landroid/content/Context;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;->I0IIOi()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;->XOO0ii0()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;->I0IIOi()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p2}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    const v0, 0x7f0a05fc

    invoke-virtual {p3, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/i0OX0X;

    invoke-direct {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/i0OX0X;-><init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;)V

    const p1, 0x7f0a08f9

    invoke-virtual {p3, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method private static final viewHolder$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mCurInfoImage:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2BytesByStream(Ljava/lang/String;)[B

    move-result-object p1

    const-string p2, "readFile2BytesByStream(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mCurSendBytes:[B

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->syncDialPopup()V

    return-void
.end method


# virtual methods
.method public final getMChange()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mChange:Z

    return v0
.end method

.method public final getMRecyclerSpanCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mRecyclerSpanCount:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140f79

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->notifyData()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d008c

    return v0
.end method

.method public onDestroy()V
    .locals 3

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mChange:Z

    if-eqz v0, :cond_0

    const-string v0, "sync_dial"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

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

.method public final setMChange(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mChange:Z

    return-void
.end method

.method public final syncDialPopup()V
    .locals 5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1404b8

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1403db

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O0OXXOX1X;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/O0OXXOX1X;-><init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O00OO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O00OO;-><init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;)V

    const v2, 0x7f1412f6

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->mSyncDialPopup:Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method
