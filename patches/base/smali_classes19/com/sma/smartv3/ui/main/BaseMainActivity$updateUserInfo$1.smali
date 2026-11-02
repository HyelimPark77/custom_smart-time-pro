.class public final Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/BaseMainActivity;->updateUserInfo(Lcom/sma/smartv3/model/AppUser;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AppUser;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1546:1\n19#2:1547\n15#2:1548\n15#2:1549\n11#2,2:1550\n11#2,2:1552\n11#2,2:1554\n*S KotlinDebug\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1\n*L\n666#1:1547\n666#1:1548\n694#1:1549\n696#1:1550,2\n703#1:1552,2\n719#1:1554,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1546:1\n19#2:1547\n15#2:1548\n15#2:1549\n11#2,2:1550\n11#2,2:1552\n11#2,2:1554\n*S KotlinDebug\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1\n*L\n666#1:1547\n666#1:1548\n694#1:1549\n696#1:1550,2\n703#1:1552,2\n719#1:1554,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Z

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;

.field public final synthetic iO:Lcom/sma/smartv3/model/AppUser;


# direct methods
.method public constructor <init>(ZLcom/sma/smartv3/ui/main/BaseMainActivity;Lcom/sma/smartv3/model/AppUser;)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->OXO1:Z

    iput-object p2, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    iput-object p3, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->iO:Lcom/sma/smartv3/model/AppUser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/AppUser;)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/model/AppUser;

    const v32, 0x7ffffff

    const/16 v33, 0x0

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

    const/16 v31, 0x0

    invoke-direct/range {v4 .. v33}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    const-class v6, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    check-cast v4, Lcom/sma/smartv3/model/AppUser;

    iget-boolean v3, v0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->OXO1:Z

    if-eqz v3, :cond_7

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getThirdPlatform()Lcom/sma/smartv3/model/ThirdPlatform;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/sma/smartv3/model/ThirdPlatform;->getProjectId()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getThirdPlatform()Lcom/sma/smartv3/model/ThirdPlatform;

    move-result-object v5

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/sma/smartv3/model/ThirdPlatform;->getOpenId()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v7

    :goto_1
    const-string v8, "OID_OPENID_DATA"

    invoke-virtual {v3, v8, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getThirdPlatform()Lcom/sma/smartv3/model/ThirdPlatform;

    move-result-object v5

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/sma/smartv3/model/ThirdPlatform;->getReplaced()I

    move-result v5

    goto :goto_2

    :cond_2
    move v5, v8

    :goto_2
    const-string v9, "OID_WE_CHAT_IS_REPLACED"

    invoke-virtual {v3, v9, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getThirdPlatform()Lcom/sma/smartv3/model/ThirdPlatform;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/sma/smartv3/model/ThirdPlatform;->getUnionId()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getThirdPlatform()Lcom/sma/smartv3/model/ThirdPlatform;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/ThirdPlatform;->getPlatform()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, v7

    :goto_3
    const-string v5, "We Chat"

    invoke-static {v3, v5, v8, v4, v7}, Lcom/android/mltcode/paycertificationapi/oe5;->I0i1OXiI(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, v0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->access$showWeChatOutLoginPopup(Lcom/sma/smartv3/ui/main/BaseMainActivity;)V

    :cond_4
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getPhone()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_5

    return-void

    :cond_5
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    if-eqz v3, :cond_6

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/model/AppUser;->setPhone(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    return-void

    :cond_7
    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v3

    const/4 v5, 0x0

    cmpg-float v3, v3, v5

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v3

    cmpg-float v3, v3, v5

    if-nez v3, :cond_a

    :goto_4
    if-eqz v1, :cond_9

    iget-object v3, v0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->iO:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AppUser;->setUnit(I)V

    :cond_9
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->parseUserInfo(Lcom/sma/smartv3/model/AppUser;)V

    return-void

    :cond_a
    const v3, 0x7f1402ba

    invoke-static {v3}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_b

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_b

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AppUser;->setNickname(Ljava/lang/String;)V

    :cond_b
    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_c

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AppUser;->setBirthday(Ljava/lang/String;)V

    :cond_c
    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v3

    cmpg-float v3, v3, v5

    if-nez v3, :cond_e

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v3

    cmpg-float v3, v3, v5

    if-nez v3, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AppUser;->setHeight(F)V

    :cond_e
    :goto_5
    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v3

    cmpg-float v3, v3, v5

    if-nez v3, :cond_10

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v3

    cmpg-float v3, v3, v5

    if-nez v3, :cond_f

    goto :goto_6

    :cond_f
    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AppUser;->setWeight(F)V

    :cond_10
    :goto_6
    if-eqz v1, :cond_11

    iget-object v3, v0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->iO:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AppUser;->setUnit(I)V

    :cond_11
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->access$toPersonalInformationActivity(Lcom/sma/smartv3/ui/main/BaseMainActivity;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/main/BaseMainActivity$updateUserInfo$1;->OXO1(Lcom/sma/smartv3/model/AppUser;)V

    return-void
.end method
