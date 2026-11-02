.class public final Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPhoneBindGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,261:1\n19#2:262\n15#2:263\n176#3,11:264\n196#3:283\n252#4,7:275\n270#4:282\n*S KotlinDebug\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment\n*L\n56#1:262\n56#1:263\n216#1:264,11\n216#1:283\n216#1:275,7\n216#1:282\n*E\n"
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u676d\u7814\u9879\u76ee\u9057\u5f03"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhoneBindGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,261:1\n19#2:262\n15#2:263\n176#3,11:264\n196#3:283\n252#4,7:275\n270#4:282\n*S KotlinDebug\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment\n*L\n56#1:262\n56#1:263\n216#1:264,11\n216#1:283\n216#1:275,7\n216#1:282\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private btnDone:Landroid/widget/Button;

.field private llContent:Landroid/widget/LinearLayout;

.field private mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private phone:Lcom/google/android/material/textfield/TextInputEditText;

.field private rootScrollView:Landroid/widget/ScrollView;

.field private tvGetVerificationCode:Landroid/widget/TextView;

.field private verificationCode:Lcom/google/android/material/textfield/TextInputEditText;

.field private viewKeyboardHeight:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    const-string v1, "PhoneBindGuideFragment"

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->TAG:Ljava/lang/String;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->initView$lambda$5(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->initView$lambda$4$0(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->initView$lambda$1$0(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;I)V

    return-void
.end method

.method public static final synthetic access$bindPhone(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->bindPhone(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkEnableButton(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->checkEnableButton()V

    return-void
.end method

.method public static final synthetic access$getMAppUser$p(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)Lcom/sma/smartv3/model/AppUser;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-object p0
.end method

.method private final bindPhone(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    const-string v3, "identity"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const-string v3, "phone"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const-string v4, "code"

    invoke-static {v4, p2}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    filled-new-array {v2, v3, p2}, [Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/OXO1;->XXX11i([Lkotlin/Pair;)Ljava/util/HashMap;

    move-result-object p2

    new-instance v2, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v4}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/appuser/force_bind_phone"

    invoke-virtual {v1, v4, v5}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6, p2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$1;

    invoke-direct {v4, p1, v2, v3}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, p2, v2

    const-class v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v1, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v1, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$2;

    invoke-direct {v1, v4}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method private final checkEnableButton()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->btnDone:Landroid/widget/Button;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "btnDone"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->phone:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v2, :cond_1

    const-string v2, "phone"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_1
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->IXOIIIO(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->verificationCode:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v2, :cond_2

    const-string v2, "verificationCode"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final done()V
    .locals 11

    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->phone:Lcom/google/android/material/textfield/TextInputEditText;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "phone"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->verificationCode:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v3, "verificationCode"

    if-nez v0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->IXOIIIO(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    const v0, 0x7f140d1f

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_2
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->verificationCode:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v4, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_3
    invoke-virtual {v4}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_4

    const v0, 0x7f1404f4

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_4
    sget-object v3, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    if-nez v5, :cond_5

    const-string v5, "rootScrollView"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v5

    :goto_0
    invoke-virtual {v3, v4, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v6

    move-object v7, v6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v6

    new-instance v8, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, v0

    move-object v0, v8

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/uq;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v5, v7

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final getVerificationCode()V
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->phone:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v1, "phone"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->IXOIIIO(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f140d1f

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    return-void

    :cond_1
    move-object v0, v1

    sget-object v1, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    move-object v3, v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    if-nez v4, :cond_2

    const-string v4, "rootScrollView"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_2
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->phone:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v5, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_3
    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->tvGetVerificationCode:Landroid/widget/TextView;

    if-nez v5, :cond_4

    const-string v5, "tvGetVerificationCode"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_4
    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v3, v4

    move-object v4, v0

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/network/RequestCommonMethod;->requestVerificationCode$default(Lcom/sma/smartv3/network/RequestCommonMethod;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->initView$lambda$1$0$1(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;I)V

    return-void
.end method

.method private static final initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->llContent:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    const-string v0, "llContent"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    iput p0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private static final initView$lambda$1$0(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->viewKeyboardHeight:Landroid/view/View;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    if-nez v0, :cond_1

    const-string v0, "rootScrollView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/av1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/av1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final initView$lambda$1$0$1(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;I)V
    .locals 1

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

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

.method private static final initView$lambda$4$0(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/app/Activity;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->done()V

    return-void
.end method

.method private static final initView$lambda$5(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->getVerificationCode()V

    return-void
.end method


# virtual methods
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

    const v1, 0x7f0a01b4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->btnDone:Landroid/widget/Button;

    const v1, 0x7f0a18fb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->viewKeyboardHeight:Landroid/view/View;

    const v1, 0x7f0a06b9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->llContent:Landroid/widget/LinearLayout;

    const v1, 0x7f0a0c07

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->tvGetVerificationCode:Landroid/widget/TextView;

    const v1, 0x7f0a18ec

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->verificationCode:Lcom/google/android/material/textfield/TextInputEditText;

    const v1, 0x7f0a0910

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->phone:Lcom/google/android/material/textfield/TextInputEditText;

    const v1, 0x7f0a09b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ScrollView;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/bv1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/bv1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const-string v2, "apply(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->rootScrollView:Landroid/widget/ScrollView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cv1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/cv1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/KeyboardUtils;->registerSoftInputChangedListener(Landroid/view/Window;Lcom/blankj/utilcode/util/KeyboardUtils$OnSoftInputChangedListener;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->verificationCode:Lcom/google/android/material/textfield/TextInputEditText;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const-string v0, "verificationCode"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    new-instance v2, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$OXO1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->phone:Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v0, :cond_2

    const-string v0, "phone"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    new-instance v2, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$XIi00iiXO;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->btnDone:Landroid/widget/Button;

    if-nez v0, :cond_3

    const-string v0, "btnDone"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getPasswordStatus()Z

    move-result v2

    if-nez v2, :cond_4

    const v2, 0x7f140fe5

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    new-instance v2, Lcom/android/mltcode/paycertificationapi/dv1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/dv1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->tvGetVerificationCode:Landroid/widget/TextView;

    if-nez v0, :cond_5

    const-string v0, "tvGetVerificationCode"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v0

    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/ev1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ev1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e68

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
