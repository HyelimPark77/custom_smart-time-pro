.class public Lcom/sma/smartv3/ui/ai/item/AITopItem;
.super Lcom/sma/smartv3/ui/status/item/MainStepItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAITopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITopItem.kt\ncom/sma/smartv3/ui/ai/item/AITopItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,188:1\n93#2,2:189\n90#2:191\n19#2:192\n15#2:193\n*S KotlinDebug\n*F\n+ 1 AITopItem.kt\ncom/sma/smartv3/ui/ai/item/AITopItem\n*L\n95#1:189,2\n95#1:191\n128#1:192\n128#1:193\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAITopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITopItem.kt\ncom/sma/smartv3/ui/ai/item/AITopItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,188:1\n93#2,2:189\n90#2:191\n19#2:192\n15#2:193\n*S KotlinDebug\n*F\n+ 1 AITopItem.kt\ncom/sma/smartv3/ui/ai/item/AITopItem\n*L\n95#1:189,2\n95#1:191\n128#1:192\n128#1:193\n*E\n"
    }
.end annotation


# instance fields
.field private ivAvatar:Lcom/sma/smartv3/view/ImageViewRound;

.field private mCardView:Landroidx/cardview/widget/CardView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mVipIcon:Landroid/view/View;

.field private mVipInfo:Landroid/widget/TextView;

.field private mVipLayout:Landroid/view/View;

.field private mVipTv:Landroid/widget/TextView;

.field private tvNickname:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->bindView$lambda$2(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->bindView$lambda$0(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->bindView$lambda$1(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/ai/item/AITopItem;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->onAvatarChange$lambda$0(Lcom/sma/smartv3/ui/ai/item/AITopItem;)V

    return-void
.end method

.method private final avatarShow()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->ivAvatar:Lcom/sma/smartv3/view/ImageViewRound;

    const/4 v1, 0x0

    const-string v2, "ivAvatar"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v3, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->ivAvatar:Lcom/sma/smartv3/view/ImageViewRound;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f081568

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->ivAvatar:Lcom/sma/smartv3/view/ImageViewRound;

    if-nez v3, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_3
    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/me/UserInfoActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final bindView$lambda$2(Lcom/sma/smartv3/ui/ai/item/AITopItem;Landroid/view/View;)V
    .locals 3

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v1, v2, v1}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "mArg0"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->Companion:Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;->XOO0ii0()I

    move-result v0

    const-string v1, "mArg1"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final onAvatarChange$lambda$0(Lcom/sma/smartv3/ui/ai/item/AITopItem;)V
    .locals 1

    const-string v0, "AvatarItem onAvatarChange"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->avatarShow()V

    return-void
.end method

.method private final onChangeUserMember()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IIII0iI()Z

    move-result v0

    const-string v1, "mVipLayout"

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipLayout:Landroid/view/View;

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "USER_MEMBER"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5f

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v6, Lcom/sma/smartv3/model/UserMember;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    check-cast v0, Lcom/sma/smartv3/model/UserMember;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    const-string v5, "mVipInfo"

    const-string v6, "mVipIcon"

    const v7, 0x7f08185c

    const-string v8, "mVipTv"

    if-lez v4, :cond_b

    iget-object v4, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipInfo:Landroid/widget/TextView;

    if-nez v4, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_2
    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getServerDateTime()J

    move-result-wide v9

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v11

    cmp-long v5, v9, v11

    if-lez v5, :cond_6

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    if-nez v0, :cond_3

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_3
    const v1, 0x7f140c31

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    if-nez v0, :cond_4

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_4
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipIcon:Landroid/view/View;

    if-nez v0, :cond_5

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v3, v0

    :goto_0
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f1400ca

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_6
    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    if-nez v2, :cond_7

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_7
    invoke-virtual {v2, v7}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    if-nez v2, :cond_8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_8
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f06079c

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    if-nez v2, :cond_9

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_9
    const v5, 0x7f140c2b

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipIcon:Landroid/view/View;

    if-nez v2, :cond_a

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    move-object v3, v2

    :goto_1
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f141491

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I0IIOi()Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v5

    invoke-direct {v3, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_b
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    if-nez v0, :cond_c

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_c
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    if-nez v0, :cond_d

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_d
    const v1, 0x7f140c30

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipIcon:Landroid/view/View;

    if-nez v0, :cond_e

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_e
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipInfo:Landroid/widget/TextView;

    if-nez v0, :cond_f

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_f
    move-object v3, v0

    :goto_3
    const-string v0, ""

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_10
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipLayout:Landroid/view/View;

    if-nez v0, :cond_11

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_4

    :cond_11
    move-object v3, v0

    :goto_4
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 3
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V

    const v0, 0x7f0a0ccd

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->tvNickname:Landroid/widget/TextView;

    const v0, 0x7f0a060f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/sma/smartv3/view/ImageViewRound;

    iput-object v1, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->ivAvatar:Lcom/sma/smartv3/view/ImageViewRound;

    const v1, 0x7f0a1907

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipLayout:Landroid/view/View;

    const v2, 0x7f0a00ab

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipIcon:Landroid/view/View;

    const v2, 0x7f0a18b5

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipInfo:Landroid/widget/TextView;

    const v2, 0x7f0a00ac

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mVipTv:Landroid/widget/TextView;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOOXII;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XOOXII;-><init>(Lcom/sma/smartv3/ui/ai/item/AITopItem;)V

    invoke-virtual {p1, v0, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const v0, 0x7f0a09f8

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/cardview/widget/CardView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mCardView:Landroidx/cardview/widget/CardView;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OIIOI;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/OIIOI;-><init>(Lcom/sma/smartv3/ui/ai/item/AITopItem;)V

    invoke-virtual {p1, v0, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi1;-><init>(Lcom/sma/smartv3/ui/ai/item/AITopItem;)V

    invoke-virtual {p1, v1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public initView()V
    .locals 33

    move-object/from16 v0, p0

    invoke-super {v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->initView()V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->avatarShow()V

    iget-object v1, v0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->tvNickname:Landroid/widget/TextView;

    if-nez v1, :cond_0

    const-string v1, "tvNickname"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/model/AppUser;

    const v31, 0x7ffffff

    const/16 v32, 0x0

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

    const/16 v30, 0x0

    invoke-direct/range {v3 .. v32}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/ai/item/AITopItem;->mCardView:Landroidx/cardview/widget/CardView;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f060023

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_2
    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->onChangeUserMember()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0184

    return v0
.end method

.method public final onAvatarChange(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "avatar_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XII01OO1I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XII01OO1I;-><init>(Lcom/sma/smartv3/ui/ai/item/AITopItem;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final onNickNameChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "nickname_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onNickNameChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->initView()V

    return-void
.end method

.method public final onThemeChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "THEME_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onThemeChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->initView()V

    return-void
.end method

.method public final onUserMemberChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "USER_MEMBER"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "onUserMemberChange"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;->onChangeUserMember()V

    return-void
.end method

.method public updateWeather()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IIII0iI()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvWeatherTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-super {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->updateWeather()V

    return-void
.end method
