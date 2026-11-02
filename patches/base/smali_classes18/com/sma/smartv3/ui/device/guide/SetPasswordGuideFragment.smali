.class public final Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSetPasswordGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,137:1\n19#2:138\n15#2:139\n183#3,4:140\n196#3:152\n252#4,7:144\n270#4:151\n*S KotlinDebug\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n*L\n31#1:138\n31#1:139\n92#1:140,4\n92#1:152\n92#1:144,7\n92#1:151\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSetPasswordGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,137:1\n19#2:138\n15#2:139\n183#3,4:140\n196#3:152\n252#4,7:144\n270#4:151\n*S KotlinDebug\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n*L\n31#1:138\n31#1:139\n92#1:140,4\n92#1:152\n92#1:144,7\n92#1:151\n*E\n"
    }
.end annotation


# instance fields
.field private btnConfirm:Landroid/widget/Button;

.field private mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private newPassword:Lcom/google/android/material/textfield/TextInputEditText;

.field private newPasswordAgain:Lcom/google/android/material/textfield/TextInputEditText;

.field private rootScrollView:Landroid/widget/ScrollView;

.field private viewKeyboardHeight:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 31

    invoke-direct/range {p0 .. p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/AppUser;

    const v29, 0x7ffffff

    const/16 v30, 0x0

    const/4 v2, 0x0

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

    invoke-direct/range {v1 .. v30}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->initView$lambda$2$0$1(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;I)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->initView$lambda$1$0(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XO0O10(Landroid/view/View;Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->initView$lambda$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V

    return-void
.end method

.method public static final synthetic access$getMAppUser$p(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)Lcom/sma/smartv3/model/AppUser;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->initView$lambda$2$0(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;I)V

    return-void
.end method

.method private static final initView$lambda$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private static final initView$lambda$1$0(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->confirm()V

    return-void
.end method

.method private static final initView$lambda$2$0(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->viewKeyboardHeight:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "viewKeyboardHeight"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput p1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    if-nez v0, :cond_1

    const-string v0, "rootScrollView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/i54;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/i54;-><init>(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final initView$lambda$2$0$1(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;I)V
    .locals 1

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    if-nez p0, :cond_0

    const-string p0, "rootScrollView"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    div-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    return-void
.end method


# virtual methods
.method public final confirm()V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPassword:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v1, "newPassword"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f140d1d

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPasswordAgain:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v3, "newPasswordAgain"

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    const v0, 0x7f140d1e

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPassword:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v4, 0x6

    if-lt v0, v4, :cond_c

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPassword:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v0, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_5
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v4, 0x20

    if-le v0, v4, :cond_6

    goto/16 :goto_1

    :cond_6
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPassword:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_7
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPasswordAgain:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v4, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_8
    invoke-virtual {v4}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const v0, 0x7f140d13

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_9
    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v3

    const-string v4, "identity"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const-string v4, "projectId"

    const-string v5, "58"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPassword:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v5, :cond_a

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v2

    :cond_a
    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "password"

    invoke-static {v5, v1}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v3, v4, v1}, [Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/OXO1;->XXX11i([Lkotlin/Pair;)Ljava/util/HashMap;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;-><init>(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    if-nez v5, :cond_b

    const-string v5, "rootScrollView"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_b
    move-object v2, v5

    :goto_0
    invoke-virtual {v0, v4, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v2

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/kangyang/set/password"

    invoke-virtual {v0, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$$inlined$post$1;

    invoke-direct {v5, v4, v3, v2}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$$inlined$post$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$$inlined$post$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$$inlined$post$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_c
    :goto_1
    const v0, 0x7f140e0a

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

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

.method public initView()V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a18fb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->viewKeyboardHeight:Landroid/view/View;

    const v1, 0x7f0a01c7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->btnConfirm:Landroid/widget/Button;

    const v1, 0x7f0a088f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPassword:Lcom/google/android/material/textfield/TextInputEditText;

    const v1, 0x7f0a0890

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->newPasswordAgain:Lcom/google/android/material/textfield/TextInputEditText;

    const v1, 0x7f0a09b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    const v1, 0x7f0a06c3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/f54;

    invoke-direct {v2, v1, p0}, Lcom/android/mltcode/paycertificationapi/f54;-><init>(Landroid/view/View;Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->btnConfirm:Landroid/widget/Button;

    if-nez v0, :cond_0

    const-string v0, "btnConfirm"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/g54;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/g54;-><init>(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h54;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/h54;-><init>(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/KeyboardUtils;->registerSoftInputChangedListener(Landroid/view/Window;Lcom/blankj/utilcode/util/KeyboardUtils$OnSoftInputChangedListener;)V

    :cond_1
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e69

    return v0
.end method

.method public onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/KeyboardUtils;->unregisterSoftInputChangedListener(Landroid/view/Window;)V

    :cond_0
    return-void
.end method

.method public onSlideDeselected()V
    .locals 0

    return-void
.end method

.method public onSlideSelected()V
    .locals 0

    return-void
.end method
