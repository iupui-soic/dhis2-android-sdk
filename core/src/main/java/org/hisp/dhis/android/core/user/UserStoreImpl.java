package org.hisp.dhis.android.core.user;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.hisp.dhis.android.core.common.BaseIdentifiableObject;
import org.hisp.dhis.android.core.data.database.DbOpenHelper;
import org.hisp.dhis.android.core.user.UserContract.Columns;

import java.util.Date;

import static org.hisp.dhis.android.core.common.StoreUtils.sqLiteBind;

public class UserStoreImpl implements UserStore {
    private static final String INSERT_STATEMENT = "INSERT INTO " + DbOpenHelper.Tables.USER + " (" +
            Columns.UID + ", " +
            Columns.CODE + ", " +
            Columns.NAME + ", " +
            Columns.DISPLAY_NAME + ", " +
            Columns.CREATED + ", " +
            Columns.LAST_UPDATED + ", " +
            Columns.BIRTHDAY + ", " +
            Columns.EDUCATION + ", " +
            Columns.GENDER + ", " +
            Columns.JOB_TITLE + ", " +
            Columns.SURNAME + ", " +
            Columns.FIRST_NAME + ", " +
            Columns.INTRODUCTION + ", " +
            Columns.EMPLOYER + ", " +
            Columns.INTERESTS + ", " +
            Columns.LANGUAGES + ", " +
            Columns.EMAIL + ", " +
            Columns.PHONE_NUMBER + ", " +
            Columns.NATIONALITY +
            ") " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private final SQLiteStatement insertRowStatement;

    public UserStoreImpl(SQLiteDatabase database) {
        this.insertRowStatement = database.compileStatement(INSERT_STATEMENT);
    }

    @Override
    public long insert(
            @NonNull String uid, @Nullable String code,
            @NonNull String name, @NonNull String displayName,
            @NonNull Date created, @NonNull Date lastUpdated,
            @Nullable String birthday, @Nullable String education, @Nullable String gender,
            @Nullable String jobTitle, @Nullable String surname, @Nullable String firstName,
            @Nullable String introduction, @Nullable String employer, @Nullable String interests,
            @Nullable String languages, @Nullable String email, @Nullable String phoneNumber,
            @Nullable String nationality) {

        insertRowStatement.clearBindings();

        sqLiteBind(insertRowStatement, 1, uid);
        sqLiteBind(insertRowStatement, 2, code);
        sqLiteBind(insertRowStatement, 3, name);
        sqLiteBind(insertRowStatement, 4, displayName);
        sqLiteBind(insertRowStatement, 5, created);
        sqLiteBind(insertRowStatement, 6, lastUpdated);
        sqLiteBind(insertRowStatement, 7, birthday);
        sqLiteBind(insertRowStatement, 8, education);
        sqLiteBind(insertRowStatement, 9, gender);
        sqLiteBind(insertRowStatement, 10, jobTitle);
        sqLiteBind(insertRowStatement, 11, surname);
        sqLiteBind(insertRowStatement, 12, firstName);
        sqLiteBind(insertRowStatement, 13, introduction);
        sqLiteBind(insertRowStatement, 14, employer);
        sqLiteBind(insertRowStatement, 15, interests);
        sqLiteBind(insertRowStatement, 16, languages);
        sqLiteBind(insertRowStatement, 17, email);
        sqLiteBind(insertRowStatement, 18, phoneNumber);
        sqLiteBind(insertRowStatement, 19, nationality);

        return insertRowStatement.executeInsert();
    }

    @Override
    public void close() {
        insertRowStatement.close();
    }
}